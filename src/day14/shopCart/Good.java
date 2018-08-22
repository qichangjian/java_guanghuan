package day14.shopCart;

public class Good {
    private int goodNo;
    private String goodName;
    private double goodPrice;
    private int goodNumber;

    public Good() {
    }

    public Good(int goodNo, String goodName, double goodPrice, int goodNumber) {
        this.goodNo = goodNo;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodNumber = goodNumber;
    }

    public int getGoodNo() {
        return goodNo;
    }

    public void setGoodNo(int goodNo) {
        this.goodNo = goodNo;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(int goodNumber) {
        this.goodNumber = goodNumber;
    }

    @Override
    public String toString() {
        return "goodNo=" + goodNo +
                ", goodName='" + goodName + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodNumber=" + goodNumber;
    }
}
