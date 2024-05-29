package SolidPrinciples.OpenClosePrinciple.OCP_Classes;

import SolidPrinciples.OpenClosePrinciple.IAreaCalculator;

public class CircleArea implements IAreaCalculator {


    private double r;

    public CircleArea(double radius){
        this.r = radius;
    }

    @Override
    public double Area() {
        return 3.14 * r * r;
    }
}
