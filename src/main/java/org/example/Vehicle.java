package org.example;

public abstract class Vehicle {
    private String name = "Vehicle: ";


    public Vehicle() {
    }


    public String vechName() {
        return name;
    }

    public abstract String move();

    public String toString()
    {
        return "This is a Abstract Class " + this.name;

    }
}
