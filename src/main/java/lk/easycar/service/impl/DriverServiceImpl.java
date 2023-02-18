package lk.easycar.service.impl;

import lk.easycar.dto.DriverDTO;
import lk.easycar.entity.Driver;
import lk.easycar.repo.DriverRepo;
import lk.easycar.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void saveDriver(DriverDTO dto) {

    }

    @Override
    public void deleteDriver(String id) {

    }

    @Override
    public void updateDriver(DriverDTO dto) {

    }

    @Override
    public ArrayList<Driver> getAllDriver() {
        return null;
    }
}
