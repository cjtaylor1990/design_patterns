package template_pattern;

public class Steak extends Dinner {
    @Override
    public void prepareDinner() {
        System.out.println("Grilling steak.");
    }

    @Override
    public void cleanUp() {
        System.out.println("Wash plate.");
    }
}