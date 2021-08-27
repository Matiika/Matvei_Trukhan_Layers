package by.tc.task01.entity;

public class TabletPC extends Appliance{
    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        TabletPC that = (TabletPC) o;
        if (getBatteryCapacity() != that.getBatteryCapacity()) {
            return false;
        }
        if (getColor() == null) {
            if (that.getColor() != null) {
                return false;
            }
        } else if (!getColor().equals(that.getColor())) {
            return false;
        }
        if (getDisplayInches() != that.getDisplayInches()) {
            return false;
        }
        if (getFlashMemoryCapacity() != that.getFlashMemoryCapacity()) {
            return false;
        }
        return getMemoryRom() == that.getMemoryRom();
    }

    @Override
    public int hashCode() {
        int result = getBatteryCapacity();
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + getDisplayInches();
        result = 31 * result + getFlashMemoryCapacity();
        result = 31 * result + getMemoryRom();
        return result;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
