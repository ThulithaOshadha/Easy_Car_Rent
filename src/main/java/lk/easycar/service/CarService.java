package lk.easycar.service;

import lk.easycar.dto.CarDTO;

public interface CarService {
    public void saveCars(CarDTO dto);
    public void deleteCar(String vehicleNum);
    public void updateDriver(CarDTO dto);

}
