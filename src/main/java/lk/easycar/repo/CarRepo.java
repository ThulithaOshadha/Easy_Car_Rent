package lk.easycar.repo;

import lk.easycar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface CarRepo extends JpaRepository<Car,String> {
    Car findCarByVehicleNum(String vehicleNum);
    ArrayList<Car> findCarsByVehicleTypeEquals(String vehicleType);
}
