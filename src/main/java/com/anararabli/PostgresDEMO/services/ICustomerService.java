package com.anararabli.PostgresDEMO.services;

import com.anararabli.PostgresDEMO.dto.DtoAdress;
import com.anararabli.PostgresDEMO.dto.DtoCustomer;

public interface ICustomerService {
    public DtoCustomer findCustomerById(Long id);

}
