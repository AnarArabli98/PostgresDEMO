package com.anararabli.PostgresDEMO.controller;

import com.anararabli.PostgresDEMO.dto.DtoCustomer;
import org.springframework.web.bind.annotation.RequestParam;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);
}
