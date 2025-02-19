package com.anararabli.PostgresDEMO.controller;

import com.anararabli.PostgresDEMO.dto.DtoHome;
import org.springframework.web.bind.annotation.PathVariable;

public interface IHomeController {
    public DtoHome findHomeById( Long id);
}
