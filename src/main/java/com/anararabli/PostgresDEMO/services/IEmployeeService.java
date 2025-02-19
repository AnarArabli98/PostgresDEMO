package com.anararabli.PostgresDEMO.services;

import com.anararabli.PostgresDEMO.dto.DtoDepartment;
import com.anararabli.PostgresDEMO.dto.DtoEmployee;
import com.anararabli.PostgresDEMO.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<DtoEmployee> findAllEmployees();
}
