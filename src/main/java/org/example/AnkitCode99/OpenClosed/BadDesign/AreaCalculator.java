package org.example.AnkitCode99.OpenClosed.BadDesign;

public class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.getLength() * rectangle.getBreadth();
    }

    public double calculateCircleArea(Circle circle){
        return Math.PI * circle.getRadius() * circle.getRadius();
    }
}

/***
 * Lets say we have a new shape pentagon next. In that case we will again end up modifying AreaCalculator class. As the types of shapes grows this becomes messier as AreaCalculator keeps on changing and any consumers of this class will have to keep on updating their libraries which contain AreaCalculator. As a result, AreaCalculator class will not be baselined(finalized) with surety as every time a new shape comes it will be modified. So, this design is not closed for modification.
 */
