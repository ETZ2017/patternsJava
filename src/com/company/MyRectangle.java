package com.company;

public class MyRectangle extends Rectangle implements IFigure {
    private double sideA;
    private double sideB;

    @Override
    public double getSideA() {
        return sideA;
    }

    @Override
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getSideB() {
        return sideB;
    }

    @Override
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public MyRectangle() {
    }

    public MyRectangle(double sideA, double sideB) {
        super(sideA, sideB);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getEscribedRadius() {
        return this.getDiagonal()/2;
    }

    @Override
    public double getInscribedRadius() {
        return (isSquare()) ? sideA/2 : 0;
    }

    @Override
    public String toString() {
        return "myRectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", Esc circle=" + this.getEscribedRadius() +
                ", In circle=" + this.getInscribedRadius() +
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
