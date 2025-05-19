package com.project.StudentRecordManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.StudentRecordManagementSystem.model.Student;

@Repository
public interface IstudentRecordManagementSystemRepo extends JpaRepository<Student, Integer> {

}
