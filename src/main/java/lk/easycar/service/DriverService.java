package lk.easycar.service;

import lk.easycar.dto.CarDTO;
import lk.easycar.entity.Car;

import java.util.ArrayList;

public interface DriverService {
    public void saveDriver(CarDTO dto);
    public void deleteDriver(String id);
    public void updateDriver(CarDTO dto);
    public ArrayList<Car> getAllDriver();

}
