package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name="tbl_employee1")
public class Employee {

    @GeneratedValue(strategy =GenerationType.SEQUENCE.AUTO)
    @Id
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Long age;

    @Column(name="email")
    private String email;

    @Column(name="department")
    private String department;
}
