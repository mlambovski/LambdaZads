package lab9zad1;

public class Computer {

    private String name;
    private int procSpeed;

    public Computer(String name, int procSpeed) {
        setProcSpeed(procSpeed);
        setName(name);
    }

    public int getProcSpeed() {
        return procSpeed;
    }

    public void setProcSpeed(int procSpeed) {
        this.procSpeed = procSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Computer: %s , %dMHz", name, procSpeed);
    }
}
