package com.cmpe275.Lab2.Models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Employee {
    private long id;  // part of the primary key
    private String employerId; // part of the primary key
    private String name; 	// required
    private String email;
    private String title;
    //private Address address;
    //private Employer employer;
    private Employee Manager;
    //private List<Employee> reports; // director reports who have the current employee as their manager.
    //private List<Employee> collaborators;

    // constructors, setters, getters, etc.
}
