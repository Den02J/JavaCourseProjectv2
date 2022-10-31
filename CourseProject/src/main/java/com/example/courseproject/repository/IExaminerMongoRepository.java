package com.example.courseproject.repository;

import com.example.courseproject.model.Examiner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExaminerMongoRepository extends MongoRepository<Examiner, String> {
}
