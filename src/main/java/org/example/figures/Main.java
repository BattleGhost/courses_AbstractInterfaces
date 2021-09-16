package org.example.figures;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Triangle(new Point(-2,3),new Point(-3,-1), new Point(3, -2));
        System.out.println(shape);
    }
}
