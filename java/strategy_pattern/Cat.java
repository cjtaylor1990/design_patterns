package strategy_pattern;

public class Cat implements AnimalStrategy {

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
    
}