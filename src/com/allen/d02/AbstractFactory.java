package com.allen.d02;

import com.allen.d02.shape.Shape;
import com.allen.d02.color.Color;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
