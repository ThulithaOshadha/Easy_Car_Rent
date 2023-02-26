package lk.easycar.dto;

import lk.easycar.entity.Car;
import lk.easycar.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Lob;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookingDTO {
    private String bookingID;
    private String currentDate;
    private String dueDate;
    private BigDecimal advancePayment;
    @Lob
    private byte[] paymentConfirmation;
    private String accepted;
    private BigDecimal total;

    private CarDTO car;
    private DriverDTO driver;
    /*private AdminDTO admin;*/
    private CustomerDTO customer;



}
