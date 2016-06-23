package com.exercise.controller;

import com.exercise.model.Student;
import com.exercise.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    IStudentService studentService;

    @RequestMapping("/greeting")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getAll() {
        return studentService.findAll();
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student get(@PathVariable Long id) {
        return studentService.findOne(id);
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student create(@RequestBody @Valid final Student student) {
        return studentService.create(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public Student update(@RequestBody @Valid final Student student) {
        return studentService.create(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        studentService.delete(id);
    }

}
