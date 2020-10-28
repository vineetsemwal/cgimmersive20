package org.cap.apps;

public class CanvasMain {

    public static void main(String args[]){
        Shape shape=new Rectangle(3,4);
        Canvas canvas=new Canvas(shape);
        canvas.draw();
    }
}
