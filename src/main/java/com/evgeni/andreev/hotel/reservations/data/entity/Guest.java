package com.evgeni.andreev.hotel.reservations.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "GUEST")
public class Guest {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String country;


    @Column
    private String city;


    @Column
    private String phoneNumber;

}
