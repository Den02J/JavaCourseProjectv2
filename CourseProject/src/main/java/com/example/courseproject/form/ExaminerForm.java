package com.example.courseproject.form;

import java.util.Objects;

public class ExaminerForm {
    public String id;
    public String examiner;
    public String points1;
    public String points2;
    public String points3;

    public ExaminerForm() {
    }

    public ExaminerForm(String examiner, String points1, String points2, String points3) {
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
        ExaminerForm that = (ExaminerForm) o;
        return examiner.equals(that.examiner) && points1.equals(that.points1) && points2.equals(that.points2) && points3.equals(that.points3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examiner, points1, points2, points3);
    }

    @Override
    public String toString() {
        return "ExaminerForm{" +
                "examiner='" + examiner + '\'' +
                ", points1='" + points1 + '\'' +
                ", points2='" + points2 + '\'' +
                ", points3='" + points3 + '\'' +
                '}';
    }
}
