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
        Shape fetchedShape1=context.getBean(Shape.class);
        System.out.println("fetched shape class name="+fetchedShape1.getClass().getSimpleName());
        boolean isFetchAndSetSame=shape==fetchedShape1;
        System.out.println("is same="+isFetchAndSetSame);
        canvas.draw();
        Shape fetchedShape2=context.getBean(Shape.class);
        boolean isFetchShapesSame=fetchedShape1==fetchedShape2;
        System.out.println("is fetched shapes same "+isFetchShapesSame);
    }
}
