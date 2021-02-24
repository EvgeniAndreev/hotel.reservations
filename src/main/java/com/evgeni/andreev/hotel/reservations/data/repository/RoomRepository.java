package com.evgeni.andreev.hotel.reservations.data.repository;

import com.evgeni.andreev.hotel.reservations.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
