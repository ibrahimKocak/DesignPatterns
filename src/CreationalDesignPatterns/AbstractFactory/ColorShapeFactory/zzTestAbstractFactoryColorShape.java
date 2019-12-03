package CreationalDesignPatterns.AbstractFactory.ColorShapeFactory;

import TestDesignPatern.Test;

public class zzTestAbstractFactoryColorShape extends Test {

    @Override
    public void start() {
        super.start();

        AbstractFactory abstractFactory = new ShapeFactory();
        abstractFactory.getShape("square").draw();

        abstractFactory = new ColorFactory();
        abstractFactory.getColor("red").fill();
    }
}
