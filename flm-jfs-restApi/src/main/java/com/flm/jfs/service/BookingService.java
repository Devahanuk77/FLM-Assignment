package com.flm.jfs.service;

import com.flm.jfs.dto.BookingDTO;

public interface BookingService {
	
	void saveTicketBooking(BookingDTO bookingDTO);
	BookingDTO getBookingDetails(String emailId);
	

}
