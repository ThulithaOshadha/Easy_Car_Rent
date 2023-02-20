package lk.easycar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Car {
    @Id
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
