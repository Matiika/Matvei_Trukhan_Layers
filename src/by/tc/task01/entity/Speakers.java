package by.tc.task01.entity;

public class Speakers extends Appliance{
    private int powerConsumption;
    private int numberSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers() {
    }

    public Speakers(int powerConsumption, int numberSpeakers, String frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberSpeakers = numberSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberSpeakers() {
        return numberSpeakers;
    }

    public void setNumberSpeakers(int numberSpeakers) {
        this.numberSpeakers = numberSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
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
        Speakers that = (Speakers) o;
        if (getCordLength() != that.getCordLength()) {
            return false;
        }
        if (getFrequencyRange() == null) {
            if (that.getFrequencyRange() != null) {
                return false;
            }
        } else if (!getFrequencyRange().equals(that.getFrequencyRange())) {
            return false;
        }
        if (getNumberSpeakers() != that.getNumberSpeakers()) {
            return false;
        }
        return getPowerConsumption() == that.getPowerConsumption();

    }

    @Override
    public int hashCode() {
        int result = getCordLength();
        result = 31 * result + (getFrequencyRange() != null ? getFrequencyRange().hashCode() : 0);
        result = 31 * result + getNumberSpeakers();
        result = 31 * result + getPowerConsumption();
        return result;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberSpeakers=" + numberSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }
}
