package lk.easycar.service.impl;

import lk.easycar.dto.BookingDTO;
import lk.easycar.entity.Booking;
import lk.easycar.repo.BookingRepo;
import lk.easycar.service.BookingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void addBooking(BookingDTO dto) {
        repo.save(mapper.map(dto, Booking.class));
    }

    @Override
    public void updateBooking(BookingDTO dto) {
        if (!repo.existsById(dto.getBookingID())){
            throw new RuntimeException(("wrong booking id"));
        }
        repo.save(mapper.map(dto,Booking.class));
    }

    @Override
    public void deleteBooking(String bookingID) {

    }

    @Override
    public ArrayList<BookingDTO> getAllBooking() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<BookingDTO>>(){}.getType());
    }

    @Override
    public BookingDTO searchBookingByAccepted(String type) {
        Booking booking = repo.findBookingsByAcceptedEquals(type);
        if (booking!=null){
            return mapper.map(booking,BookingDTO.class);
        }
        return null;
    }

    @Override
    public void updateAcceptedBooking(String id) {
        System.out.println(id);
        repo.updateAcceptedBooking(id);
    }
}
