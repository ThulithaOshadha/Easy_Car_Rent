package lk.easycar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Booking {
    @Id
    private String bookingID;
    private LocalDate currentDate;
    private LocalDate dueDate;
    private BigDecimal advancePayment;
    @Lob
    private byte[] paymentConfirmation;
    private boolean isAccepted;


    @ManyToOne
    private Car car;
    @ManyToOne
    private Driver driver;
    /*@ManyToOne
    private Admin admin;*/
    @ManyToOne
    private Customer customer;
}
