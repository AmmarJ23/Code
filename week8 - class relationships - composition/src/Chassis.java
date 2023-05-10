public class Chassis {
    private String chassisNum;
    private String manufactureYear;

    public Chassis(){}
    public Chassis(String chassisNum, String manufactureYear) {
        this.chassisNum = chassisNum;
        this.manufactureYear = manufactureYear;
    }

    public String getChassisNum() {
        return this.chassisNum;
    }

    public void setChassisNum(String chassisNum) {
        this.chassisNum = chassisNum;
    }

    public String getManufactureYear() {
        return this.manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

}
