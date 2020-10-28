package org.cap.apps;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Rectangle implements Shape{
    private double length;
    private double breadth;

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
