package Animal;

import Animal.Animal;
import Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chip chip";
    }

    @Override
    public String howToEat() {
        return "fried is best";
    }
}
