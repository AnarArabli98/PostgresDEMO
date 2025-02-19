package com.anararabli.PostgresDEMO.repository;

import com.anararabli.PostgresDEMO.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = "from Student" , nativeQuery = false)
    List<Student> findAllStudents();



}
