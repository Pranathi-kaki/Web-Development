package com.practice.SpringProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dish {

    @Id //Acts as primary key
    @GeneratedValue(strategy = GenerationType.AUTO)    //for Auto generation of id
    private int Id;
    private String name,description, category;
    private float price;
    private boolean availability;

    //Image code
    public Dish(){

    }

    public Dish(String name, String description, String category, float price, boolean availability) {

        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.availability = availability;
    }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public boolean isAvailability() {
            return availability;
        }

        public void setAvailability(boolean availability) {
            this.availability = availability;
        }

    @Override
    public String toString() {
        return "Dish{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}
