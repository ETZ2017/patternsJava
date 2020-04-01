package com.company;

public class LabaPerson {
    private MyRectangle myRectangle;
    private int variant;
    private String name;

    public MyRectangle getMyRectangle() {
        return myRectangle;
    }


    public void setMyRectangle(MyRectangle myRectangle) {
        this.myRectangle = myRectangle;
    }

    public int getVariant() {
        return variant;
    }

    public void setVariant(int variant) {
        this.variant = variant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LabaPerson() {
    }

    public LabaPerson(MyRectangle myRectangle, int variant, String name) {
        this.myRectangle = myRectangle;
        this.variant = variant;
        this.name = name;
    }

    @Override
    public String toString() {
        return "labaPerson{" +
                "myRectangle=" + myRectangle +
                ", variant=" + variant +
                ", name='" + name + '\'' +
                '}';
    }
}
