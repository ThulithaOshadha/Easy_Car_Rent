package lk.easycar.service;

import lk.easycar.dto.CarDTO;

import java.util.ArrayList;

public interface CarService {
    public void saveCars(CarDTO dto);
    public void deleteCar(String vehicleNum);
    public void updateCars(CarDTO dto);
    public ArrayList<CarDTO> getAllCars();

    public CarDTO searchCarWithVehicleNum(String vehicleNum);

}
