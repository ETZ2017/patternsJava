package com.company;

public class TriangleFactory {
    public static Triangle create(double sideA, double sideB, double sideC) {
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideC + sideB < sideA) {
            return null;
        } else {
            return new Triangle(sideA, sideB, sideC);
        }
    }
}
