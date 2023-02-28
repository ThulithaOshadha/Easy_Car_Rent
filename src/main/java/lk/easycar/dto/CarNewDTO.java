package lk.easycar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarNewDTO {
    private String vehicleNum;
    private String model;
    private String vehicleType;
    private String transmissionType;
    private String color;
    private String fuelType;
    private int passengers;
    private BigDecimal monthlyPrice;
    private BigDecimal dailyPrice;
    private int freeMileage;
    private boolean available;
}
