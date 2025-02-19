package com.anararabli.PostgresDEMO.controller;

import com.anararabli.PostgresDEMO.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DtoEmployee> findAllEmployees();
}
