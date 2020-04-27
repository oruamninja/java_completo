package entities;

public class Account {

    private Integer number;
    private String holder;
    private double balance;

    private static int WITHDRAWAL_RATE = 5;

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(Integer number, String holder, double inicialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit);
    };

    public Integer getAccountNumber() {
        return number;
    };

    public String getAccountHolder() {
        return holder;
    };

    public Double getBalance() {
        return balance;
    }

    public void setAccountHolder( String holder ) {
        this.holder = holder;
    };

    public void deposit( double value ) {
        this.balance += value;
    };

    public void withdraw( double value ) {
        this.balance = (this.balance - WITHDRAWAL_RATE) - value;
    };

    @Override
    public String toString() {
        return "Account " + this.number + ", Holder: " + this.holder + ", Balance: $ " + String.format("%.2f",this.balance);
    };

}