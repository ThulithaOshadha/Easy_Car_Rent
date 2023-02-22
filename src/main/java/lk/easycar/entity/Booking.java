package lk.easycar.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
@Entity

public class Booking {
    @Id
    private String bookingID;
    private LocalDate date;
    private LocalTime time;
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "nic",referencedColumnName = "nic",nullable = false)
    private Customer nic;
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "vehicleNum",referencedColumnName = "vehicleNum",nullable = false)
    private Car vehicleNum;
}
