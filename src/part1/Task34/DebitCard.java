package part1.Task34;

public class DebitCard extends Card{
    private String DebetType;

    public DebitCard(int balance, String id, String name, String debetType) {
        super(balance, id, name);
        DebetType = debetType;
    }

    public String getDebetType() {
        return DebetType;
    }

    public void setDebetType(String debetType) {
        DebetType = debetType;
    }

    @Override
    public void shouBalance(int balance) {
        super.shouBalance(balance);




    }
}

