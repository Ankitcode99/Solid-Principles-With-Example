package org.example.AnkitCode99.OpenClosed.GoodDesign;

public class Rectangle implements Shape{

    public double length;

    public double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return this.length * this.breadth;
    }
}
