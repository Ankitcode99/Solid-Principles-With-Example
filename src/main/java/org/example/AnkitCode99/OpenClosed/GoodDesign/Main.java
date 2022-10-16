package org.example.AnkitCode99.OpenClosed.GoodDesign;

public class Main {

    public static void main(String args[]){

        AreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println("Circle area = "+areaCalculator.calculateShapeArea(circle));

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setBreadth(15);
        System.out.println("Rectangle area = "+areaCalculator.calculateShapeArea(rectangle));

    }

}
