package factory_pattern;

public class Main {
    public static void main(String[] args) {
        RobotFactory factory = new ConcreteRobotFactory();

        Robot robot1 = factory.createRobot("cleaning", "Carlos");
        Robot robot2 = factory.createRobot("medical", "Manuel");

        robot1.introduceSelf();
        robot2.introduceSelf();
    }
}