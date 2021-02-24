package com.evgeni.andreev.hotel.reservations.web;

import com.evgeni.andreev.hotel.reservations.business.domain.RoomReservation;
import com.evgeni.andreev.hotel.reservations.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/reservations")
public class RoomReservationWebServiceController {
    private final ReservationService reservationService;

    @Autowired
    public RoomReservationWebServiceController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<RoomReservation> getRoomReservations(@RequestParam(name="date", required = false) String dateString){
        Date date = DateUtils.createDateFormatString(dateString);
        return this.reservationService.getReservationsForDate(date);
    }
}
