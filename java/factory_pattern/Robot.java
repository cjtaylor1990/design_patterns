package factory_pattern;

abstract public class Robot {
    String name;

    public Robot(String name) {
        this.name = name;
    }

    public abstract void introduceSelf();
}