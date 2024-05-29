package SolidPrinciples.OpenClosePrinciple.OCP_Classes;

import SolidPrinciples.OpenClosePrinciple.IAreaCalculator;

public class ReactangleArea implements IAreaCalculator {

    private double l, b;

    public ReactangleArea(double len, double bre){
        l = len;
        b = bre;
    }
    @Override
    public double Area() {
        return l * b;
    }
}
