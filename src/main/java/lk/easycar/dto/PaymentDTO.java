package lk.easycar.dto;

import lk.easycar.entity.Booking;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {
    private String bookingID;
    private Booking booking;
    private BigDecimal rent;
    private String account;
    private String paymentMethod;
    private BigDecimal deduction;
}
