package org.example;

public class Airplane extends Vehicle {
    private int windows = 84;
    private String totalWindows = String.valueOf(windows);
    public Airplane()
    {
        super();
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int seats) {
        this.windows = windows;
    }

    public String move()
    {
        return "A airplane fly";

    }

    public String vechName()
    {
        return super.vechName() + "Airplane Inherited from VECHILE_ Total seats: "+ this.totalWindows;

    }
}
