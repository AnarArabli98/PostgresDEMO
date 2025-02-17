package com.anararabli.PostgresDEMO.services;

import com.anararabli.PostgresDEMO.dto.DtoStudent;
import com.anararabli.PostgresDEMO.dto.DtoStudentIU;
import com.anararabli.PostgresDEMO.entity.Student;

import java.util.List;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudentById(Integer id);

    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);

}
