package by.itstep.aniskovich.java.lesson36.controller;

public class Box {
    private int value;

    public Box() {
    }

    public Box(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
