package com.anararabli.PostgresDEMO.controller;

import com.anararabli.PostgresDEMO.dto.DtoStudent;
import com.anararabli.PostgresDEMO.dto.DtoStudentIU;
import com.anararabli.PostgresDEMO.entity.Student;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentById(int id);
    public void deleteStudentById(int id);
    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
}
