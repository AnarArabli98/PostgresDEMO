package com.anararabli.PostgresDEMO.services.impl;

import com.anararabli.PostgresDEMO.dto.DtoAdress;
import com.anararabli.PostgresDEMO.dto.DtoCustomer;
import com.anararabli.PostgresDEMO.entity.Adress;
import com.anararabli.PostgresDEMO.entity.Customer;
import com.anararabli.PostgresDEMO.repository.CustomerRepository;
import com.anararabli.PostgresDEMO.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DtoCustomer findCustomerById(Long id) {
        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAdress dtoAdress = new DtoAdress();

        Optional<Customer> optional = customerRepository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }
        Customer customer = optional.get();
        Adress  adress = optional.get().getAdress();

        BeanUtils.copyProperties(customer,dtoCustomer);
        BeanUtils.copyProperties(adress,dtoAdress);

        dtoCustomer.setAdress(dtoAdress);
        return dtoCustomer;

    }
}
