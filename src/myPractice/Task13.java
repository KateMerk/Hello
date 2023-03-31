package myPractice;

public class Task13 {
    public static void main(String[] args) {
        int countLowest=0;
        int countHighest=10;
        int value=1;


        while (countLowest<= countHighest){
            if(countLowest==0)
                value = value * (countLowest+1);
            else
                value=value*countLowest;
            countLowest++;
            System.out.println("Factorial of "+(countLowest-1)+" is "+value);
            }
}}

