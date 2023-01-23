package com.flm.jfs.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flm.jfs.dto.BookingDTO;
import com.flm.jfs.model.UserBookings;
import com.flm.jfs.repository.BookingRepository;
import com.flm.jfs.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	BookingRepository bookingRepository;

	@Override
	public void saveTicketBooking(BookingDTO bookingDTO) {
		UserBookings userBookings = new UserBookings();
		System.out.println("BookingService Invoked !");
		userBookings.setNoOfPassengers(4);
		BeanUtils.copyProperties(bookingDTO, userBookings);
		bookingRepository.save(userBookings);
	}

	@Override
	public BookingDTO getBookingDetails(String emailId) {
		UserBookings userBookings = bookingRepository.findById(emailId).get();
		BookingDTO bookingDTO = new BookingDTO();
		BeanUtils.copyProperties(userBookings, bookingDTO);
		return bookingDTO;
	}

}
