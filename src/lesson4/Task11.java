package lesson4;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" дом 1 a*b ");
        System.out.print("введите a:");
        int a = sc.nextInt();
        System.out.print("введите b:");
        int b = sc.nextInt();
        System.out.println(" дом 2 с*d ");
        System.out.print("введите c:");
        int c = sc.nextInt();
        System.out.print("введите d:");
        int d = sc.nextInt();
        System.out.println(" участок e*f ");
        System.out.print("введите e:");
        int e = sc.nextInt();
        System.out.print("введите f:");
        int f = sc.nextInt();
        boolean vlineiku = (e > (a + c)) & (f > max(b, d));
        boolean drugnaddrugom = (e>max(a,c)) & (f> (b+d));
        boolean pomestitsa = vlineiku | drugnaddrugom;
        if (pomestitsa) {System.out.print(" дом 1 и дом 2 поместятся на участке ");}
        else {System.out.print(" дом 1 и дом 2 НЕ поместятся на участке ");}

    }

    private static int max(int b, int d) {
        return 0;
    }
}
