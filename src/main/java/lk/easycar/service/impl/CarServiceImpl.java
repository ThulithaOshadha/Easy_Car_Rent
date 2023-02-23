package lk.easycar.service.impl;

import lk.easycar.dto.CarDTO;
import lk.easycar.dto.CustomerDTO;
import lk.easycar.entity.Car;
import lk.easycar.repo.CarRepo;
import lk.easycar.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

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
    public void updateCars(CarDTO dto) {
        if (!repo.existsById(dto.getVehicleNum())){
            throw new RuntimeException("Wrong vehicle num...please check the number");
        }
        repo.save(mapper.map(dto,Car.class));
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }

    @Override
    public CarDTO searchCarWithVehicleNum(String vehicleNum) {
        Car car = repo.findCarByVehicleNum(vehicleNum);
        if (car!=null){
            return mapper.map(car,CarDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CarDTO> searchCarWithVehicleType(String vehicleType) {
        return mapper.map(repo.findCarsByVehicleTypeEquals(vehicleType),new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }
}
