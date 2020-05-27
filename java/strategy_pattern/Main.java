package strategy_pattern;

public class Main {
    public static void main(String[] args) {
        AnimalContext context = new AnimalContext();

        Cat cat = new Cat();
        Dog dog = new Dog();

        context.talkToAnimal(cat);
        context.talkToAnimal(dog);
    }
}