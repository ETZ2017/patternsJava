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
 * Copyright notice1
 */

public abstract class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle() {
    }


    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public boolean isSquare () {
        return this.sideA == this.sideB;
    }


    /*public Rectangle(double sideA, double sideB) {
        if(!isValid()) {
            this.sideA = 0;
            this.sideB = 0;
        } else {
            this.sideA = sideA;
            this.sideB = sideB;
        }
    }

    private boolean isValid() {
        boolean real;
        if (this.sideA == 0) {
            real = false;
        } else {
            if (this.sideB == 0) {
                real = false;
            } else {
                real = true;
            }
        }
        return real;
    }*/

    public double getPerimeter(){
        return this.sideA*2 + this.sideB*2;
    }

    public double getArea(){
        return this.sideA*this.sideB;
    }

    public double getDiagonal(){
        return Math.sqrt(this.sideA*this.sideA + this.sideB*this.sideB);
    }

    /*public double getCircumscribedCirclesArea() {
        return this.getDiagonal()/2;
    }*/

    public double getCosOftheAngleBetweentheSideandDiagonal(){
        return this.sideB/this.getDiagonal();
    }

    public abstract double getEscribedRadius();
    public abstract double getInscribedRadius();

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                ", diagonal=" + this.getDiagonal() +
       //         ", circumscribed circle's area=" + this.getCircumscribedCirclesArea() +
                ", cos of the angle between the side and diagonal=" + this.getCosOftheAngleBetweentheSideandDiagonal() +
                '}';
    }
}
