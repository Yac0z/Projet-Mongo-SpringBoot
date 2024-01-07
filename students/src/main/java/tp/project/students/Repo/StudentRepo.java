package tp.project.students.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tp.project.students.Entity.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, String> {

}
