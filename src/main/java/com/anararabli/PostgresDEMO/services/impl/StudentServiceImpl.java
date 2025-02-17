package com.anararabli.PostgresDEMO.services.impl;

import com.anararabli.PostgresDEMO.dto.DtoStudent;
import com.anararabli.PostgresDEMO.dto.DtoStudentIU;
import com.anararabli.PostgresDEMO.entity.Student;
import com.anararabli.PostgresDEMO.repository.StudentRepository;
import com.anararabli.PostgresDEMO.services.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        Student student = new Student();
        DtoStudent response = new DtoStudent();
        BeanUtils.copyProperties(dtoStudentIU, student);

        Student dbstudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbstudent,response);

        return response;

    }

    @Override
    public List<DtoStudent> getAllStudents() {
        List<DtoStudent> dtoStudents = new ArrayList<>();
        List<Student> studentList = studentRepository.findAll();
        for (Student student : studentList) {
            DtoStudent dtoStudent = new DtoStudent();
            BeanUtils.copyProperties(student,dtoStudent);
            dtoStudents.add(dtoStudent);
        }
        return dtoStudents;
    }

    @Override
    public DtoStudent getStudentById(Integer id) {
        DtoStudent dto = new DtoStudent();
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student dbstudent = optionalStudent.get();
            BeanUtils.copyProperties(dbstudent,dto);
        }
        return dto;
    }

    @Override
    public void deleteStudentById(Integer id) {
//        DtoStudent dtoStudent =  getStudentById(id);
        Optional<Student> optional= studentRepository.findById(id);
        if (optional.isPresent()) {
            studentRepository.delete(optional.get());
        }

    }

    @Override
    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
        DtoStudent dto = new DtoStudent();
          Optional<Student> optionalStudent =  studentRepository.findById(id);
          if (optionalStudent.isPresent()) {
              Student dbstudent = optionalStudent.get();
              dbstudent.setFirstName(dtoStudentIU.getFirstName());
              dbstudent.setLastName(dtoStudentIU.getLastName());
              dbstudent.setBirthDate(dtoStudentIU.getBirthDate());

              Student updatedstudent= studentRepository.save(dbstudent);
              BeanUtils.copyProperties(updatedstudent,dto);
              return dto;


          }
//        DtoStudent dbstudent =  getStudentById(id);
//        if (dbstudent != null) {
//            dbstudent.setFirstName(updateStudent.getFirstName());
//            dbstudent.setLastName(updateStudent.getLastName());
//            dbstudent.setBirthDate(updateStudent.getBirthDate());
//            studentRepository.save(dbstudent);
//        }
        return null;
    }

}
