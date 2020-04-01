package com.company;

import java.util.Objects;

/*
 *Laboratory work #3
 *
 * Kryklyvets Yevheniia
 * group 243(2), IFTKN, department of software engineering
 * Variant 4
 * 2019.09.19
 *
 * Copyright notice
 */

public class Cube {
    private double sideA;

    public Cube() {
    }

    public Cube(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }


    public double getArea(){
        return 6*this.sideA*this.sideA;
    }


    public double getVolume(){
        return this.sideA*this.sideA*this.sideA;
    }

    public double getDiagonalofFacet(){
        return this.sideA*Math.sqrt(2);
    }

    public double getDiagonalofFigure() {
        return this.sideA*Math.sqrt(3);
    }

    public double getPerimeter(){
        return 12*this.sideA;
    }



    @Override
    public int hashCode() {
        return Objects.hash(getSideA());
    }

    @Override
    public String toString() {
        return "Cube{" +
                "sideA=" + sideA +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                ", diagonal of figure=" + this.getDiagonalofFigure() +
                ", diagonal of facet=" + this.getDiagonalofFacet() +
                ", volume=" + this.getVolume() +
                '}';
    }
}
