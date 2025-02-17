package com.anararabli.PostgresDEMO.repository;

import com.anararabli.PostgresDEMO.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
