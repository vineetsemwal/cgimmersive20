package org.cap.apps;

public class Rectangle implements Shape{
    private double length,breadth;

    public Rectangle(){

    }

    public Rectangle(double len,double breadth){
        this.length=len;
        this.breadth=breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double area(){
        return length*breadth;
    }
}
