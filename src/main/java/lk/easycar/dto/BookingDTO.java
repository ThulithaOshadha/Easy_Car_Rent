package lk.easycar.dto;

import lk.easycar.entity.Car;
import lk.easycar.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookingDTO {
    private String bookingID;
    private LocalDate date;
    private LocalTime time;
    private String nic;
    private String vehicleNum;
}
