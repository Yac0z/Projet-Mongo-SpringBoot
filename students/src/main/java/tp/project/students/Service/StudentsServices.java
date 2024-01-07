package tp.project.students.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp.project.students.Entity.Student;
import tp.project.students.Repo.StudentRepo;

@Service
public class StudentsServices {

  @Autowired
  private StudentRepo repo;

  public void saveorUpdate(Student students) {

    repo.save(students);
  }

  public Iterable<Student> listAll() {

    return this.repo.findAll();
  }

  public void deleteStudent(String id) {

    repo.deleteById(id);
  }

  public Student getStudentByID(String studentid) {

    return repo.findById(studentid).get();
  }
}