package com.example.courseproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Examiner {
    @Id
    public String id;
    public String firstName;
    public String lastName;
    public String specialty;
    public String examiner;
    public String points1;
    public String points2;
    public String points3;


    public Examiner() {
    }

    public Examiner(String firstName, String lastName, String specialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
    }

    public Examiner(String id, String firstName, String lastName, String specialty, String examiner, String points1, String points2, String points3) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.examiner = examiner;
        this.points1 = points1;
        this.points2 = points2;
        this.points3 = points3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExaminer() {
        return examiner;
    }

    public void setExaminer(String examiner) {
        this.examiner = examiner;
    }

    public String getPoints1() {
        return points1;
    }

    public void setPoints1(String points1) {
        this.points1 = points1;
    }

    public String getPoints2() {
        return points2;
    }

    public void setPoints2(String points2) {
        this.points2 = points2;
    }

    public String getPoints3() {
        return points3;
    }

    public void setPoints3(String points3) {
        this.points3 = points3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Examiner examiner = (Examiner) o;
        return id.equals(examiner.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Examiner{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialty='" + specialty + '\'' +
                ", examiner='" + examiner + '\'' +
                ", points1='" + points1 + '\'' +
                ", points2='" + points2 + '\'' +
                ", points3='" + points3 + '\'' +
                '}';
    }
}
