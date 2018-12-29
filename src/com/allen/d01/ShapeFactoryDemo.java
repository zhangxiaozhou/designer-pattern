package com.allen.d01;

public class ShapeFactoryDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

        shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();

        shape = shapeFactory.getShape("SQUARE");
        shape.draw();
    }
}
