package com.anararabli.PostgresDEMO.controller.impl;

import com.anararabli.PostgresDEMO.controller.IAdressController;
import com.anararabli.PostgresDEMO.dto.DtoAdress;
import com.anararabli.PostgresDEMO.dto.DtoCustomer;
import com.anararabli.PostgresDEMO.entity.Adress;
import com.anararabli.PostgresDEMO.repository.AdressRepository;
import com.anararabli.PostgresDEMO.services.IAdressService;
import com.anararabli.PostgresDEMO.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/rest/api/adress")
public class AdressControllerImpl implements IAdressController {

    @Autowired
    private IAdressService iAdressService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoAdress findAdressById(@PathVariable(name = "id") Long id) {
        return iAdressService.findAdressById(id);
    }
}

