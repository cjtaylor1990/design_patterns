package factory_pattern;

abstract public class RobotFactory {
    public abstract Robot createRobot(String type, String name);
}