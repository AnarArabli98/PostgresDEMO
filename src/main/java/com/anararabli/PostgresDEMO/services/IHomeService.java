package com.anararabli.PostgresDEMO.services;

import com.anararabli.PostgresDEMO.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
