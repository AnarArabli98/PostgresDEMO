package com.anararabli.PostgresDEMO.repository;

import com.anararabli.PostgresDEMO.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home,Long> {

}
