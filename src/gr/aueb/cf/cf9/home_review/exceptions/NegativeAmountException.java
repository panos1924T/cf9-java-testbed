package gr.aueb.cf.cf9.home_review.exceptions;

public class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super(message);
    }
}
