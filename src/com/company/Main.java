package com.company;
/*
*Laboratory work #3,4
*
* Kryklyvets Yevheniia
* group 243(2), IFTKN, department of software engineering
* Variant 4
* 2019.09.19
*
* Copyright notice
 */


public class Main {

    public static void main(String[] args) {
	    /*Rectangle myRectangle = new Rectangle (3,4);

        System.out.println(myRectangle.toString());
        System.out.println(myRectangle.hashCode());*/

        /*Square mySquare = new Square(5);

        System.out.println(mySquare.toString());

        MyRectangle rect = new MyRectangle(6, 6);

        LabaPerson valera = new LabaPerson(rect, 4, "Valera");

        System.out.println(valera.toString());

        System.out.println(rect.toString());

        Cube  myCube = new Cube (5);

        System.out.println(myCube.toString());
        //System.out.println(myCube.hashCode());

        MyRectangle r1 = new MyRectangle(4,4);

        RectangleFactory factory = new RectangleFactory(3,4);
        MyRectangle r2 = factory.create();
        if(r2==null) System.out.println("NULL");
        else System.out.println(r2.toString());

        MyRectangle r3 = RectangleFactory.createStatic(5, 4);
        System.out.println(r3.toString());*/

        //IFigure triangle = AbstractFactory.create(3,4,5, Figure.TRIANGLE);

        IFigure square = AbstractFactory.create(4,4, Figure.SQUARE);

        IFigure rectangle = AbstractFactory.create(5,4, Figure.MYRECTANGLE);

        MyRectangle newRectangle = new MyRectangle.Builder()
                .setSideA(4.5)
                .setSideB(3.5)
                .build();

        if(newRectangle != null) {
            System.out.println(newRectangle.toString());
        } else {
            System.out.println("Wrong data entered");
        }


    }
}
