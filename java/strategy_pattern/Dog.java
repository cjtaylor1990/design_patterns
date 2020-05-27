package strategy_pattern;

public class Dog implements AnimalStrategy {
    
    @Override
    public void speak() {
        System.out.println("Bark!");
    }
    
}