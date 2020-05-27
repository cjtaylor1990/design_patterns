package factory_pattern;

public class MedicalRobot extends Robot {
    public MedicalRobot(String name) {
        super(name);
    }

    @Override
    public void introduceSelf() {
        System.out.println("My name is " + this.name + ". I am a medical robot.");
    }
    
}