package gr.aueb.cf.cf9.home_review;


import java.math.BigDecimal;

/**
 *  Account java bean
 */
public class Account {

    private int id;
    private String iban;
    private String ssn;
    private BigDecimal balance;

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
}
