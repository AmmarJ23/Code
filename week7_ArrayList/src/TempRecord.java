// Name             : Ammar bin Jamalludin
// Matric No.       : A21EC0160
// Course - Section : SECJ2154 - 06
// Title            : Assignment Week 7 (ArrayList)

public class TempRecord {
    private String name;
    private Double temperature;
    private String remark;

    //------------------------Constructor------------------------//
    TempRecord(){};
    TempRecord(String n, Double t, String r)
    {
        this.name = n;
        this.temperature = t;
        this.remark = r;
    }

    //------------------------get methods------------------------//
    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    public Double getTemperature() {
        return temperature;
    }

    //------------------------set methods------------------------//
    public void setName(String name) {
        this.name = name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "\nTown Name: " + name + "\nTemperature: " + temperature + "\nRemark: " + remark + "\n";
    }
}
