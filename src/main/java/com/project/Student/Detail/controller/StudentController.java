package com.project.Student.Detail.controller;

import com.project.Student.Detail.entity.Student;
import com.project.Student.Detail.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student theStudent){
        return studentService.saveStudent(theStudent);
    }
    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return studentService.saveStudent(students);
    }
    @GetMapping("/students")
    public  List<Student> findAllStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student theStudent){
        return studentService.updateStudent(theStudent);
    }
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }






}
