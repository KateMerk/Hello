package myPractice;

public class Task15 {
    public static void main(String[] args) {
        long num = 7893823445L;
        long sum=0;
        do {
            sum+=(num%10);
            num/=10;
        }
        while (num!=0);


        System.out.println(sum);
    }
}
