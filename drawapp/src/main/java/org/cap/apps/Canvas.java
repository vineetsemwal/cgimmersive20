package org.cap.apps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Canvas {

    @Autowired
    private Shape shape ;

    public Canvas(){

    }

    public Canvas(Shape shape){
        this.shape=shape;
    }

    public Shape getShape() {
        return shape;
    }


    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("inside Canvas's afterInit shape="+shape.getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("inside Canvas's destroy");
    }

    public void draw(){
        double shapeArea=shape.area();
        System.out.println("share area drawn ="+shapeArea);
    }

}
