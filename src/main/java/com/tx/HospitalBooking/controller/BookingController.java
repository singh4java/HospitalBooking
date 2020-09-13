package com.tx.HospitalBooking.controller;

import com.tx.HospitalBooking.dto.BookingDto;
import com.tx.HospitalBooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;
    @PostMapping("/book")
    public String booking(@RequestBody BookingDto dto ){
        return bookingService.booking(dto);
    }
}
