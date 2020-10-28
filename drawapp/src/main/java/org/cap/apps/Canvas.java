package org.cap.apps;

public class Canvas {

    private Rectangle rectangle = new Rectangle(5,4);

    public void draw(){
        double shapeArea=rectangle.area();
        System.out.println("share area drawn ="+shapeArea);
    }

}
