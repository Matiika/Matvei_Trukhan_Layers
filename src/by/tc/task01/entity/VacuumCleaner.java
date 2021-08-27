package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
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
        VacuumCleaner that = (VacuumCleaner) o;
        if (getBagType() == null) {
            if (that.getBagType() != null) {
                return false;
            }
        } else if (!getBagType().equals(that.getBagType())) {
            return false;
        }
        if(getFilterType() == null){
            if(that.getFilterType()!=null){
                return false;
            }
        }else if (!getFilterType().equals(that.getFilterType())){
            return false;
        }
        if (getMotorSpeedRegulation() != that.getMotorSpeedRegulation()) {
            return false;
        }
        if (getWandType() == null) {
            if (that.getWandType() != null) {
                return false;
            }
        } else if (!getWandType().equals(that.getWandType())) {
            return false;
        }
        return getPowerConsumption() == that.getPowerConsumption();
    }

    @Override
    public int hashCode() {
        int result = getPowerConsumption();
        result = 31 * result + (getFilterType() != null ? getFilterType().hashCode(): 0);
        result = 31 * result + (getBagType() != null ? getBagType().hashCode() : 0);
        result = 31 * result + (getWandType() != null ? getWandType().hashCode() : 0);
        result = 31 * result + getMotorSpeedRegulation();
        result = 31 * result + getCleaningWidth();
        return result;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
