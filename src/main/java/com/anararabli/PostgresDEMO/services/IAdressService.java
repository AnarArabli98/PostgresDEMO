package com.anararabli.PostgresDEMO.services;

import com.anararabli.PostgresDEMO.dto.DtoAdress;

public interface IAdressService {

    public DtoAdress findAdressById(long id);
}
