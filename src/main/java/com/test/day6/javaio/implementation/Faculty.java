package com.accenture.day6.javaio.implementation;

public class Faculty {

    private int id;
    private String clearanceLevel, name;

    public Faculty() {
        //empty constructor
    }

    public Faculty(int id, String clearanceLevel, String name) {
        this.id = id;
        this.clearanceLevel = clearanceLevel;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClearanceLevel() {
        return clearanceLevel;
    }

    public void setClearanceLevel(String clearanceLevel) {
        this.clearanceLevel = clearanceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", clearanceLevel='" + clearanceLevel + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
