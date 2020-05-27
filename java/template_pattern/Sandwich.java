package template_pattern;

public class Sandwich extends Dinner {
    @Override
    public void prepareDinner() {
        System.out.println("Assembling the sandwich.");
    }

    @Override
    public void cleanUp() {
        System.out.println("No clean up.");
    }
}