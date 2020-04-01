package com.company;

public class AbstractFactory {
    public static IFigure create(double a, double b, Figure figure) {
        switch (figure){
            case MYRECTANGLE: return RectangleFactory.create(a,b);
            case SQUARE: return SquareFactory.create(a, b);
            default: return null;
        }
    }

    public static IFigure create (double a, double b, double c, Figure figure) {
        switch (figure){
            case TRIANGLE: return (IFigure) TriangleFactory.create(a, b, c);
            default: return null;
        }

    }
}
