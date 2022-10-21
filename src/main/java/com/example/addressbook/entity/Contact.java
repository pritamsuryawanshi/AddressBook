package com.example.addressbook.entity;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column
    public String name;

    @Column
    public String phoneNumber;

}
