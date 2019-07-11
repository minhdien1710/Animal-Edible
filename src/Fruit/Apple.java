package Fruit;

import Edible.Edible;

public class Apple extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "just bite it";
    }
}
