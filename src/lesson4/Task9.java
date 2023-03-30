package lesson4;

public class Task9 {
    public static void main(String[] args) {
        int roubles= 301;
        if (roubles%10==1){
            System.out.println(roubles+ " "+ "рубль");
        }
        else if (roubles%10==2||roubles%10==3||roubles%10==4){
            System.out.println(roubles + "рубля");
        }
        else
            System.out.println(roubles + " "+  "рублей");
    }
}
