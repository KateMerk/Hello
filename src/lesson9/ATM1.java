package lesson9;

public class ATM1 {
    private int twenty;
    private int fifty;
    private int hundred;

    public final static String Twenty = "twenty";
    public final static String Fifty = "fifty";
    public final static String Hundred = "hundred";

    public final static int twentyAmount = 100;
    public final static int fiftyAmount = 100;
    public final static int hundredAmount = 100;

    public ATM1(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public int getHundred() {
        return hundred;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    @Override
    public String toString() {
        return "ATM1{" +
                "twenty=" + twenty +
                ", fifty=" + fifty +
                ", hundred=" + hundred +
                '}';
    }

    public void addMoney(String type,int amount){
        if (getHundred()+amount<hundredAmount||getTwenty()+amount<twentyAmount||getFifty()+amount<fiftyAmount){
            switch (type){
                case (Twenty):
                    twenty= getTwenty()+amount;
                    break;
                case (Fifty):
                    fifty= getFifty()+amount;
                    break;
                case (Hundred):
                    hundred= getHundred()+amount;
                    break;

            }


        }
        else {
            System.out.println("Невозможно добавить купюру");
        }

    }
    public boolean getMoney(int sum){
        int havesum = getTwenty() * 20 + getFifty() * 50 + getHundred() * 100;
        if (havesum < sum) {
            return false;
        } else {
            if (sum % 20 != 0) {
                System.out.println("Невозможно получить данную сумму,купюры только 20 50 100");
                return false;
            } else {
                int amounthundred = sum / 100;
                int amountfifty = (sum - amounthundred * 100) / 50;
                int amounttwenty = (sum - amounthundred * 100 - amountfifty * 50) / 20;
                System.out.println("Кол-во 100:  " + amounthundred + "  Кол-во 50:  " + amountfifty + "  Кол-во 20: " + amounttwenty);
            }
            return true;
        }
    }

}
