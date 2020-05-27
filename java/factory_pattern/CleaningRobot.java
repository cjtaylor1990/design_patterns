package factory_pattern;

public class CleaningRobot extends Robot {
    public CleaningRobot(String name) {
        super(name);
    }

    @Override
    public void introduceSelf() {
        System.out.println("My name is " + this.name + ". I am a cleaning robot.");
    }
    
}