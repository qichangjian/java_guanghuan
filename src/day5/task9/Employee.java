package day5.task9;

public class Employee {
    private String eNo;
    private String eName;
    private String eTel;
    private double eHeight;
    private double ePrice;

    public Employee() {
    }

    public Employee(String eNo, String eName, String eTel, double eHeight, double ePrice) {
        this.eNo = eNo;
        this.eName = eName;
        this.eTel = eTel;
        this.eHeight = eHeight;
        this.ePrice = ePrice;
    }

    public String geteNo() {
        return eNo;
    }

    public void seteNo(String eNo) {
        this.eNo = eNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteTel() {
        return eTel;
    }

    public void seteTel(String eTel) {
        this.eTel = eTel;
    }

    public double geteHeight() {
        return eHeight;
    }

    public void seteHeight(double eHeight) {
        this.eHeight = eHeight;
    }

    public double getePrice() {
        return ePrice;
    }

    public void setePrice(double ePrice) {
        this.ePrice = ePrice;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eNo='" + eNo + '\'' +
                ", eName='" + eName + '\'' +
                ", eTel='" + eTel + '\'' +
                ", eHeight='" + eHeight + '\'' +
                ", ePrice='" + ePrice + '\'' +
                '}';
    }
}
