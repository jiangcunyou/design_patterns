package org.starBucks;

public abstract class Beverage {
    String description = "Unknown Beverage";

    static int TALL = -1;
    static int GRANDE = -2;
    static int VENTI = -3;
    int size = 0;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Integer getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
