package com.anararabli.PostgresDEMO;

import com.anararabli.PostgresDEMO.configuration.GlobalProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"com.anararabli"})
@ComponentScan(basePackages = {"com.anararabli"})
@EnableJpaRepositories
//@Configuration
//@PropertySource("classpath:application.properties")
@EnableConfigurationProperties(value = GlobalProperties.class)
public class PostgresDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(PostgresDemoApplication.class, args);
	}

}
