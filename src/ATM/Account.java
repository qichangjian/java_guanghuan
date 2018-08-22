package ATM;

public class Account {
    private int account = 1000;
    private String pwd = "111";
    private double money = 0;

    public Account() {
    }

    public Account(int account, String pwd, double money) {
        this.account = account;
        this.pwd = pwd;
        this.money = money;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                ", money=" + money +
                '}';
    }
}
