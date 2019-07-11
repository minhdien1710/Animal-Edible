import Animal.Chicken;
import Animal.Tiger;
import Fruit.Apple;
import Fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        System.out.println(tiger.makeSound());

        Chicken chicken = new Chicken();
        System.out.println(chicken.howToEat());
        System.out.println(chicken.makeSound());


        Apple apple = new Apple();
        System.out.println(apple.howToEat());

        Orange orange = new Orange();
        System.out.println(orange.howToEat());
    }
}
