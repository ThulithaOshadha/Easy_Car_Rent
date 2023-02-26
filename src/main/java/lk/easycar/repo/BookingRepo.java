package lk.easycar.repo;

import lk.easycar.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking,String> {
    Booking findBookingsByAcceptedEquals(String type);
}
