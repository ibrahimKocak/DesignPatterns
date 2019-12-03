package CreationalDesignPatterns.FactoryMethod.ShapeFactory;

import TestDesignPatern.Test;

public class zzTestFactoryShape extends Test {

    @Override
    public void start() {
        super.start();

        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape(ShapeType.Rectangle).draw();
    }
}
