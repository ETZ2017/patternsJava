package com.company;

public class Square extends Rectangle implements IFigure {

    private double sideA;
    private double sideB;

    public Square(double sideA1, double sideB1) {
        this.sideA = sideA1;
        this.sideB = sideB1;
    }

    public double getEscribedRadius() {
        return this.getDiagonal()/2;
    }

    public double getInscribedRadius() {
        return this.sideA/2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + sideA +
                " area=" + super.getArea() +
                " perimeter=" + super.getPerimeter() +
                " Es radius=" + getEscribedRadius() +
                " In radius=" + getInscribedRadius() +
                '}';
    }

    @Override
    public double getAria() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
