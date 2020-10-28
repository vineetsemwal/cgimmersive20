package org.cap.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CanvasMain {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(JavaConfiguration.class);
        context.refresh();
        Canvas canvas=context.getBean(Canvas.class);
        Shape shape=canvas.getShape();
        System.out.println("set shape class name="+shape.getClass().getSimpleName());
        Shape fetchedShape=context.getBean(Shape.class);
        System.out.println("fetched shape class name="+fetchedShape.getClass().getSimpleName());
        boolean isSame=shape==fetchedShape;
        System.out.println("is same="+isSame);
        canvas.draw();

    }
}
