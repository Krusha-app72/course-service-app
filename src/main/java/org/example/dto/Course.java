package org.example.dto;
//import lombok.AccessLevel;
//import lombok.RequiredArgsConstructor;
//import lombok.AllArgsConstructor;
//import lombok.NonNull;
import jdk.jfr.DataAmount;

//@DataAmount
//@AllArgsConstructor
//@NoArgsConstructor
public class Course {
    private int id;
    private String name;
    private double price;

    public Course() {
        //super();
    }

    public Course(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
