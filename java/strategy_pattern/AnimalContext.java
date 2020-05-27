package strategy_pattern;

public class AnimalContext {
    public void talkToAnimal(AnimalStrategy animal) {
        animal.speak();
    }
}