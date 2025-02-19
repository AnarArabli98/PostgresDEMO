package com.anararabli.PostgresDEMO.controller;

import com.anararabli.PostgresDEMO.dto.DtoStudent;
import com.anararabli.PostgresDEMO.dto.DtoStudentIU;
import com.anararabli.PostgresDEMO.entity.Student;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentById(Integer id);
    public void deleteStudentById(Integer id);
    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);


}
