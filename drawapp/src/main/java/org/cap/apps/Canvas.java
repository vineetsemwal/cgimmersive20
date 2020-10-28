package org.cap.apps;

public class Canvas {

    private Shape shape = new Rectangle(5,4);

    public void draw(){
        double shapeArea=shape.area();
        System.out.println("share area drawn ="+shapeArea);
    }

}
