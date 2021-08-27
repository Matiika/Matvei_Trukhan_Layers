package by.tc.task01.entity;

public class Oven extends Appliance{
    private int powerConsumption;
    private int weight;
    private int capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
    }

    public Oven(int powerConsumption, int weight, int capacity, double depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        Oven oven = (Oven) o;

        if (getPowerConsumption() != oven.getPowerConsumption()) {
            return false;
        }
        if (getWeight() != oven.getWeight()) {
            return false;
        }
        if (getCapacity() != oven.getCapacity()) {
            return false;
        }
        if (getDepth() != oven.getDepth()) {
            return false;
        }
        if (getHeight() != oven.getHeight()) {
            return false;
        }
        return !(getWidth() != oven.getWidth());
    }

    @Override
    public int hashCode() {
        int result = getCapacity();
        result = result * 31 + (int)Math.round(getDepth());
        result = result * 31 + (int)Math.round(getHeight());
        result = result * 31 + getPowerConsumption();
        result = result * 31 + getWeight();
        result = result * 31 + (int)Math.round(getWidth());
        return result;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
