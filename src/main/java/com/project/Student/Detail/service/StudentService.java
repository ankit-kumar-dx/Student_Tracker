package com.project.Student.Detail.service;

import com.project.Student.Detail.entity.Student;
import com.project.Student.Detail.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student saveStudent(Student theStudent){
        return studentRepo.save(theStudent);
    }
    public List<Student> saveStudent(List<Student> theStudent){
        return studentRepo.saveAll(theStudent);
    }
    public List<Student> getStudents(){
        return studentRepo.findAll();
    }
    public Student getStudentById(int id){
        return studentRepo.findById(id).orElse(null);
    }
    public String deleteStudent (int id){
        studentRepo.deleteById(id);
        return "student deleted || "+id;
    }
    public Student updateStudent(Student theStudent){
        Student existingStudent = studentRepo.findById(theStudent.getId()).orElse(null);
        existingStudent.setFirstName(theStudent.getFirstName());
        existingStudent.setLastName(theStudent.getLastName());
        existingStudent.setEmail(theStudent.getEmail());
        return studentRepo.save(existingStudent);
    }










}
