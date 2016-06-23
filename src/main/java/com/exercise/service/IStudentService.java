package com.exercise.service;

import com.exercise.model.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findOne(Long id);

    Student create(Student student);

    void delete(Long id);

    Student update(Student student);

}
