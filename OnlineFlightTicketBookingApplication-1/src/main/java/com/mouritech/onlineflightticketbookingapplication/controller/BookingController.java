package com.mouritech.onlineflightticketbookingapplication.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingDateAlreadyExistsException;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.BookingRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.UserRepository;
import com.mouritech.onlineflightticketbookingapplication.service.BookingService;

@RestController// (@Controller + @ResponseBody)
@RequestMapping("booking/api/v1")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	@Autowired
	BookingRepository bookingRepository;
	
	@PostMapping("bookings")
	public Booking insertBooking(@RequestBody Booking newBooking) {
		
		return bookingService.insertBooking(newBooking);
		
	}
	@GetMapping("booking")
	public List<Booking> showAllBookings(){
		return bookingService.showAllBookings();
		
	}
	@GetMapping("booking/{bid}")
	public Booking showBookingById(@PathVariable("bid") String bookingId) throws BookingNotFoundException{
		return bookingService.showBookingById(bookingId);
				
		
	}
	@PutMapping("booking/{bid}")
	public Booking updateBookingById(@PathVariable("bid") String bookingId,@RequestBody Booking booking) throws BookingNotFoundException{
		return bookingService.updateBookingById(bookingId, booking);
		
	}
	
	@DeleteMapping("booking/{bid}")
	public String deleteProductById(@PathVariable("bid") String bookingId) throws BookingNotFoundException{
		bookingService.deleteBookingById(bookingId);
		 return "deleted the booking";
		
	}
//	@GetMapping("/products/{sellerid}")
//	public ResponseEntity<List<Product>> getAllProductsBySellerId(@PathVariable("sellerid") Long sellerId) throws SellerNotFoundException {
//		return productService. getAllProductsBySellerId(sellerId);
//	}
//	
//	@PostMapping("/products/{sellerid}/seller")
//	public ResponseEntity<Product> createProduct(@PathVariable("sellerid") Long sellerId,
//			@RequestBody Product newProduct) throws SellerNotFoundException {
//		return productService.createProduct(sellerId,newProduct);
//		
//	}
//	
//	@GetMapping("/booking/{userid}/{bookingDate}")
//	public Booking getBookingDateByUser(@PathVariable("userId") String userId,
//			@PathVariable("bokkingDate") Date bokkingDate) throws UserNotFoundException, BookingDateAlreadyExistsException {
//		return bookingService.getBookingDateByUser(userId,bookingDate);
//	}
	
}
