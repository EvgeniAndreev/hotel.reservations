package com.evgeni.andreev.hotel.reservations.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column
    private String name;

    @Column
    private String number;

    @Column
    private String bedInfo;
}
