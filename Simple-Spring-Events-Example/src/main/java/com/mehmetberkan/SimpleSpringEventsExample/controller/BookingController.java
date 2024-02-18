package com.mehmetberkan.SimpleSpringEventsExample.controller;

import com.mehmetberkan.SimpleSpringEventsExample.request.HotelBookRequest;
import com.mehmetberkan.SimpleSpringEventsExample.service.ReservationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookingController {

    private final ReservationService reservationService;

    public BookingController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public void bookHotel(@RequestBody HotelBookRequest hotelBookRequest) {
        reservationService.publishReservationEvent(hotelBookRequest);
        System.out.println("The user request has been processed. " + hotelBookRequest);
    }


}
