package com.company;

public class SquareFactory {
    public static Square create(double sideA, double sideB) {
        if(sideA == sideB){
            return new Square(sideA, sideB);
        } else {
            return null;
        }
    }
}
