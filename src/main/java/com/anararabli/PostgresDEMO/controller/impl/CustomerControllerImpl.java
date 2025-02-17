package com.anararabli.PostgresDEMO.controller.impl;

import com.anararabli.PostgresDEMO.controller.ICustomerController;
import com.anararabli.PostgresDEMO.dto.DtoCustomer;
import com.anararabli.PostgresDEMO.services.ICustomerService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControllerImpl implements ICustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoCustomer findCustomerById(@PathVariable(name = "id") Long id) {
        return customerService.findCustomerById(id) ;
    }
}
