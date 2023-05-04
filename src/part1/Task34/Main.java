package part1.Task34;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(5000,"1234 5678 9123 4555","Павлович");
        DebitCard debitCard= new DebitCard(3000,"15634896245678","Merk","salary card");
        CreditCard creditCard = new CreditCard(8900,"2356 5645 4566 4456","Ivanov",
                "installment card");
        card.shouBalance(500);
        System.out.println( " Ваш баланс" +" "+ card.getBalance()+" "+"номер вашей карты"+ " "+" "+card.getId()+" "+"личные данные"+
                " "+card.getName());
        System.out.println(debitCard.getDebetType());
        System.out.println(creditCard.getCreditType()+" "+ creditCard.getName());





    }
}
