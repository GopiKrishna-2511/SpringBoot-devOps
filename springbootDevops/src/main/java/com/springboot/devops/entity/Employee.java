package com.springboot.devops.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    String name ;

    @Column(name="age")
    String age;

    @Column(name="gender")
    String gender;

    @Column(name="city")
    String city;

    @Column(name="pin_code")
    String pinCode;


}

