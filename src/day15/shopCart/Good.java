package day15.shopCart;

public class Good {
    private int goodNo;
    private String goodName;
    private double goodPrice;

    public Good() {
    }

    public Good(int goodNo, String goodName, double goodPrice) {
        this.goodNo = goodNo;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
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

    @Override
    public String toString() {
        return  "\t" + goodNo +
                "\t\t\t" + goodName +
                "\t\t\t" + goodPrice;
    }
}
