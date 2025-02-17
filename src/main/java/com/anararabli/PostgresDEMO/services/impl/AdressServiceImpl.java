package com.anararabli.PostgresDEMO.services.impl;

import com.anararabli.PostgresDEMO.dto.DtoAdress;
import com.anararabli.PostgresDEMO.dto.DtoCustomer;
import com.anararabli.PostgresDEMO.entity.Adress;
import com.anararabli.PostgresDEMO.repository.AdressRepository;
import com.anararabli.PostgresDEMO.services.IAdressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdressServiceImpl implements IAdressService {
    DtoAdress dtoAdress =  new DtoAdress();

    @Autowired
    private AdressRepository adressRepository;

    @Override
    public DtoAdress findAdressById(long id) {
        Optional<Adress> optionalAdress = adressRepository.findById(id);
        if (optionalAdress.isEmpty()) {
            return null;
        }
        Adress adress = optionalAdress.get();
        BeanUtils.copyProperties(adress, dtoAdress);

        DtoCustomer dtoCustomer = new DtoCustomer();
        dtoCustomer.setId(adress.getCustomer().getId());
        dtoCustomer.setName(adress.getCustomer().getName());
//        dtoCustomer.setAdress(dtoAdress);


        dtoAdress.setCustomer(dtoCustomer);

        return dtoAdress;
}}
