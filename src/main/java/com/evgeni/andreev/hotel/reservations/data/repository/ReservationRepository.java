package com.evgeni.andreev.hotel.reservations.data.repository;

import com.evgeni.andreev.hotel.reservations.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

    Iterable<Reservation> findReservationByReservationDate(Date date); // "Date" from SQL!
}