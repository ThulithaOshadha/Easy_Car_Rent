package lk.easycar.repo;

import lk.easycar.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookingRepo extends JpaRepository<Booking,String> {

    Booking findBookingByDriver_License(String driverLicense);

    Booking findBookingsByAcceptedEquals(String type);
    @Query(value = "update Booking set accepted='true' where bookingID=:id",nativeQuery = true)
    Booking updateAcceptedBooking(@Param("id") String id);
}
