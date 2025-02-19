package com.anararabli.PostgresDEMO.services.impl;

import com.anararabli.PostgresDEMO.dto.DtoHome;
import com.anararabli.PostgresDEMO.dto.DtoRoom;
import com.anararabli.PostgresDEMO.entity.Home;
import com.anararabli.PostgresDEMO.entity.Room;
import com.anararabli.PostgresDEMO.repository.HomeRepository;
import com.anararabli.PostgresDEMO.services.IHomeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceImpl implements IHomeService {



    @Autowired
    private HomeRepository homeRepository;

    @Override
    public DtoHome findHomeById(Long id) {
        DtoHome dtoHome = new DtoHome();
        Optional<Home> optional = homeRepository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }
        Home dbhome = optional.get();
        List<Room> dbrooms = optional.get().getRoom();
        BeanUtils.copyProperties(dbhome, dtoHome);
        if (dbrooms!= null && !dbrooms.isEmpty()) {
            for (Room room : dbrooms) {
                DtoRoom dtoRoom = new DtoRoom();
                BeanUtils.copyProperties(room, dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }

        }
        return dtoHome;

    }
}
