package com.flm.jfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flm.jfs.dto.BookingDTO;
import com.flm.jfs.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@PostMapping("/save-booking")
	public String saveBookingsInDB(@RequestBody BookingDTO bookingDTO) {
		bookingService.saveTicketBooking(bookingDTO);
		return "User ticket booking stored in db successfully !";
	}
	
	@GetMapping("/get-bookingDetails/{emailId}")
	public BookingDTO getBookingDetails(@PathVariable String emailId) {
		System.out.println("BookingController Invoked !");
		return bookingService.getBookingDetails(emailId);
		
	}
	@PutMapping("/update-booking")
	public String updateBookingDetails(@RequestBody BookingDTO bookingDTO) {
		bookingService.saveTicketBooking(bookingDTO);
		return "User booking details updated successfully";
		
	}

}
