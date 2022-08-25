package org.example;

public class RectangleCalculator {
    private final Rectangle rectangle;
    private double area;
    public RectangleCalculator(Rectangle rectangle){
        this.rectangle=rectangle;
    }
    public void calculateArea(){
        area=rectangle.getLength()* rectangle.getBreadth();
    }
    public double getArea(){
        return area;
    }
}
