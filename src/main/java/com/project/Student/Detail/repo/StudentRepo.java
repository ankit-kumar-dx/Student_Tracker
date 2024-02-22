package com.project.Student.Detail.repo;

import com.project.Student.Detail.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
