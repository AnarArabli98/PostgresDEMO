package com.anararabli.PostgresDEMO.services.impl;

import com.anararabli.PostgresDEMO.dto.DtoDepartment;
import com.anararabli.PostgresDEMO.dto.DtoEmployee;
import com.anararabli.PostgresDEMO.entity.Employee;
import com.anararabli.PostgresDEMO.repository.EmployeeRepository;
import com.anararabli.PostgresDEMO.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> findAllEmployees() {
        List<DtoEmployee> dtoEmployees = new ArrayList<>();
        List<Employee> employeeList =employeeRepository.findAll();
        if(employeeList != null && !employeeList.isEmpty()){
            for (Employee employee : employeeList) {
               DtoEmployee dtoEmployee = new DtoEmployee();
                BeanUtils.copyProperties(employee,dtoEmployee);

                dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),
                        employee.getDepartment().getDepartmentName()));
                dtoEmployees.add(dtoEmployee);
            }
        }
        return dtoEmployees;
    }
}
