package lk.easycar.service.impl;

import lk.easycar.dto.CarDTO;
import lk.easycar.entity.Car;
import lk.easycar.repo.CarRepo;
import lk.easycar.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CarServiceImpl implements CarService{
    @Autowired
    private CarRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void saveCars(CarDTO dto) {
        repo.save(mapper.map(dto, Car.class));

    }

    @Override
    public void deleteCar(String vehicleNum) {

    }

    @Override
    public void updateDriver(CarDTO dto) {

    }
}
