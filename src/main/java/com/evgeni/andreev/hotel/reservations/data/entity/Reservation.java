package com.evgeni.andreev.hotel.reservations.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private long roomId;

    @Column
    private long guestId;

    @Column
    private Date reservationDate;
}
