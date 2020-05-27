package factory_pattern;

public class ConcreteRobotFactory extends RobotFactory{
    @Override
    public Robot createRobot(String type, String name) {
        switch (type) {
            case "cleaning":
                return new CleaningRobot(name);
            case "medical":
                return new MedicalRobot(name);
            default:
                return null;
        }
    }
}