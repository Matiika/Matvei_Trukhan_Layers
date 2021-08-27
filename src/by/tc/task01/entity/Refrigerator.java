package by.tc.task01.entity;

public class Refrigerator extends Appliance{
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator() {
    }

    public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height, int width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
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

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
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

        Refrigerator that = (Refrigerator) o;

        if (getPowerConsumption() != that.getPowerConsumption()) {
            return false;
        }
        if (getWeight() != that.getWeight()) {
            return false;
        }
        if (getFreezerCapacity() != that.getFreezerCapacity()) {
            return false;
        }
        if (getOverallCapacity() != that.getOverallCapacity()) {
            return false;
        }
        if (getHeight() != that.getHeight()) {
            return false;
        }
        return getWidth() == that.getWidth();
    }

    @Override
    public int hashCode() {
        int result = getPowerConsumption();
        result = 31 * result + getWeight();
        result = 31 * result + getFreezerCapacity();
        result = 31 * result + (int) Math.round(getOverallCapacity());
        result = 31 * result + getHeight();
        result = 31 * result + getWidth();
        return result;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
