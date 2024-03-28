package by.itstep.aniskovich.java.lesson36.controller;

public class Main {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.setValue(15);
        box.setValue("abc");
        box.setValue(new A());
        //...
        A a = (A) box.getValue();

//        Box box1= new Box();
//        box1.setValue(10);
//        int n = box1.getValue();
//        System.out.println(box1);

//        A a = new C();
//
//        System.out.println(a instanceof C);
//        System.out.println(a instanceof B);
//        System.out.println(a instanceof A);
//        System.out.println(a instanceof String);
//        System.out.println(a instanceof Object);

    }
}
