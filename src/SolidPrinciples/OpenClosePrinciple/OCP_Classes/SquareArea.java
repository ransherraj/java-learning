package SolidPrinciples.OpenClosePrinciple.OCP_Classes;

import SolidPrinciples.OpenClosePrinciple.IAreaCalculator;

public class SquareArea implements IAreaCalculator {

    private double side;

    public SquareArea(double s){
        side = s;
    }

    @Override
    public double Area() {
        return side * side;
    }
}
