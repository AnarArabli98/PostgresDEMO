package com.anararabli.PostgresDEMO.repository;

import com.anararabli.PostgresDEMO.entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long> {

}
