package org.cap.apps;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Rectangle implements Shape{
    @Value("${rectangle.length}")
    private double length;
    @Value("${rectangle.breadth}")
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

    @PostConstruct
    public void afterInitialize(){
        System.out.println("inside Rectangle afterInitialize length="+length+" breadth="+breadth);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("isnide Rectangle's destroy");
    }

    @Override
    public double area(){
        return length*breadth;
    }
}
