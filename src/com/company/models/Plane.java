package com.company.models;

public class Plane {

    private Long id;
    private String model;
    private int capacity;

    public Plane() {
    }

    public Plane(Long id, String model, int capacity) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
