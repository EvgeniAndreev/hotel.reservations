package com.evgeni.andreev.hotel.reservations.data.repository;

import com.evgeni.andreev.hotel.reservations.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
