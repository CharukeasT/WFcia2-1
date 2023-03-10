package com.example.sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.Table.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
