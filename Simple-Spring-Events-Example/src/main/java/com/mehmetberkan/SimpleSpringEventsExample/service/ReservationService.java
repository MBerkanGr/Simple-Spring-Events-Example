package com.mehmetberkan.SimpleSpringEventsExample.service;

import com.mehmetberkan.SimpleSpringEventsExample.event.ReservationCreatedEvent;
import com.mehmetberkan.SimpleSpringEventsExample.request.HotelBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Async
    public void publishReservationEvent(HotelBookRequest hotelBookRequest) {
        applicationEventPublisher.publishEvent(new ReservationCreatedEvent(hotelBookRequest));
    }
}
