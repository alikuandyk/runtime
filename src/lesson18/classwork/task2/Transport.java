package lesson18.classwork.task2;

public abstract class Transport {
    private Types type;
    private int numberOfWheels;
    private String name;

    public Transport(Types type, int numberOfWheels, String name) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
        this.name = name;
    }

    public abstract void energy();

    public abstract void signal();

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
