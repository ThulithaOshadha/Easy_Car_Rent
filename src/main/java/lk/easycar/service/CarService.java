package lk.easycar.service;

import lk.easycar.dto.CarDTO;
import lk.easycar.dto.CarNewDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

public interface CarService {
    public void saveCars(CarDTO dto/*, MultipartFile img*/);
    public void deleteCar(String vehicleNum);
    public void updateCars(CarDTO dto);
    public ArrayList<CarDTO> getAllCars();

    public CarDTO searchCarWithVehicleNum(String vehicleNum);
    public ArrayList<CarDTO> searchCarWithVehicleType(String vehicleType);

}
