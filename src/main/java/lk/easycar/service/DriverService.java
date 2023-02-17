package lk.easycar.service;

import lk.easycar.dto.CarDTO;
import lk.easycar.dto.DriverDTO;
import lk.easycar.entity.Car;
import lk.easycar.entity.Driver;

import java.util.ArrayList;

public interface DriverService {
    public void saveDriver(DriverDTO dto);
    public void deleteDriver(String id);
    public void updateDriver(DriverDTO dto);
    public ArrayList<Driver> getAllDriver();

}
