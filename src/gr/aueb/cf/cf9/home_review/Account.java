package gr.aueb.cf.cf9.home_review;


import java.math.BigDecimal;

/**
 *  Account java bean
 */
public class Account {

    private int id;
    private String iban;
    private String ssn;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban() {
        this.iban = iban;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return returns the account state in a string as an output
     */
    public String accountToString() {
        return "(Iban: " + iban + "Ssn: " + ssn + "Balance: " + balance + ")";
    }

    /**
     * this method is part of the public API
     * and allows the client to do a deposit
     *
     * @param amount        the amount the client deposits
     * @throws Exception    negative amount exception if amount < 0
     */
    public void deposit(double amount) throws Exception{
        try {
            if (amount < 0) throw new Exception("Negative amount Exception! ");
            balance += amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     *  first it checks if the ssn is correct to allow withdrawal
     *  this method allows the user to withdraw money from the account
     * @param amount        the amount the user withdraws
     * @throws Exception    insufficient if amount > balance
     */
    public void withdraw(double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) throw new Exception("Invalid ssn exception");
            if (amount > balance) throw new Exception("Insufficient balance exception");
            balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
