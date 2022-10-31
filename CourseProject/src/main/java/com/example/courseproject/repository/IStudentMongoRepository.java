package com.example.courseproject.repository;

import com.example.courseproject.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentMongoRepository extends MongoRepository<Student, String> {
}
