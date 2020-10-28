package org.cap.apps;

public class Canvas {

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

    public void draw(){
        double shapeArea=shape.area();
        System.out.println("share area drawn ="+shapeArea);
    }

}
