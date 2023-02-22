package lk.easycar.service.impl;

import lk.easycar.dto.BookingDTO;
import lk.easycar.entity.Booking;
import lk.easycar.repo.BookingRepo;
import lk.easycar.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}
