package CreationalDesignPatterns.Prototype.ColorPrototype;

import TestDesignPatern.Test;

public class zzTestPrototypeColor extends Test {

    @Override
    public void start() {
        super.start();

        ColorStore.getColor("Blue").addColor();
        ColorStore.getColor("Black").addColor();
        ColorStore.getColor("Black").addColor();
    }
}
