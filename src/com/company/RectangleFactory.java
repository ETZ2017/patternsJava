package com.company;

public class RectangleFactory {
    /*private int sideA;
   private int sideB;

   public int getSideA() {
       return sideA;
   }

   public void setSideA(int sideA) {
       this.sideA = sideA;
   }

   public int getSideB() {
       return sideB;
   }

   public void setSideB(int sideB) {
       this.sideB = sideB;
   }

   public RectangleFactory(int sideA, int sideB) {
       this.sideA = sideA;
       this.sideB = sideB;
   }

   public RectangleFactory() {
   }
*/
    public static MyRectangle create(double sideA, double sideB) {
        if(sideA != 0 && sideB != 0) {
            return new MyRectangle(sideA, sideB);
        } else return null;
    }
}
