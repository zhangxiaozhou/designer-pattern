package com.allen.d02;

import com.allen.d02.color.ColorFactory;
import com.allen.d02.shape.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(factoryType.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
