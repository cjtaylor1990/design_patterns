package template_pattern;

public class Main {
    public static void main(String[] args) {
        Dinner dinner1 = new Sandwich();
        Dinner dinner2 = new Steak();

        dinner1.dinner();
        dinner2.dinner();
    }
}