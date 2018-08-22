package ATM;

public class Main {
    static Account[] accounts = new Account[100];
    static int accountIndex = 0;
    static int loginAccount = 0;
    public static void main(String[] args) {
        Menu.mainMenu();
    }
}
