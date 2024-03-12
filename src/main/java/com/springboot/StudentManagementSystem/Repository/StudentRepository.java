package com.springboot.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.StudentManagementSystem.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{

}
