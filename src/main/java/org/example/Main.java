package org.example;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(5.0, 4.0);
        RectangleCalculator rectangleCalculator=new RectangleCalculator(rectangle);

        double area=rectangleCalculator.calculateArea().getArea();

        System.out.println(area);
    }
}