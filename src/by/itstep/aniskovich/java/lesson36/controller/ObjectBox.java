package by.itstep.aniskovich.java.lesson36.controller;

public class ObjectBox {
    private Object value;

    public ObjectBox() {
    }

    public ObjectBox(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
