package part1.Task34;

public class CreditCard extends Card {
    private String CreditType;

    public CreditCard(int balance, String id, String name, String creditType) {
        super(balance, id, name);
        CreditType = creditType;
    }

    public String getCreditType() {
        return CreditType;
    }

    public void setCreditType(String creditType) {
        CreditType = creditType;
    }
}
