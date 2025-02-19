package com.anararabli.PostgresDEMO.controller.impl;

import com.anararabli.PostgresDEMO.configuration.DataSource;
import com.anararabli.PostgresDEMO.configuration.GlobalProperties;
import com.anararabli.PostgresDEMO.configuration.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api/property")
public class PropertySourceController {


    @Autowired
    private GlobalProperties globalProperties;

    @GetMapping("/datasource")
    public DataSource datasource() {
//        DataSource dataSource = new DataSource();
//        dataSource.setUrl(globalProperties.getUrl());
//        dataSource.setUsername(globalProperties.getUsername());
//        dataSource.setPassword(globalProperties.getPassword());
        return null;
    }
@GetMapping(value = "/getservers")
    public List<Server> getServers() {
    return globalProperties.getServers();
    }
}
