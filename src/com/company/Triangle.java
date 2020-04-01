package com.company;

import java.util.Objects;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = Math.sqrt((this.sideA*this.sideA)+(this.sideB*this.sideB));
    }

    public double getArea(){
        return this.sideB*this.sideA*0.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getSideA(), getSideA()) == 0 &&
                Double.compare(triangle.getSideB(), getSideB()) == 0 &&
                Double.compare(triangle.getSideC(), getSideC()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB(), getSideC());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", area=" + this.getArea() +
                '}';
    }
}
