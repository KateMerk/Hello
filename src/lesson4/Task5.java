package lesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа");
        Scanner scanner =  new Scanner(System.in);
        int number = scanner.nextInt();
        int number1= scanner.nextInt();
        int result = statetement(number,number1);
        System.out.printf("Результат операции:" + result );


    }
    static int statetement(int i1, int i2){
        int statetement = (i1 + i2) + i1 * i2;
        return statetement;
}}

