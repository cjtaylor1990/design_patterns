package template_pattern;

abstract public class Dinner {
    abstract void prepareDinner();
    abstract void cleanUp();

    public void eatDinner() {
        System.out.println("It is delicious!");
    }

    public void dinner() {
        prepareDinner();
        eatDinner();
        cleanUp();
    }
}