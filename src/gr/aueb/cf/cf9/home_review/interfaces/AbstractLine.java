package gr.aueb.cf.cf9.home_review.interfaces;

public abstract class AbstractLine implements ILine{

    @Override
    public void drawLine(int length) {
        for (int i = 0; i < length; i++) {
            printChar();
        }

        System.out.println();
    }

    protected abstract void printChar();
}
