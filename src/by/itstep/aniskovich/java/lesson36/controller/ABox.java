package by.itstep.aniskovich.java.lesson36.controller;

public class ABox {
    private A value;

    public ABox() {
    }

    public ABox(A value) {
        this.value = value;
    }

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
