package lesson4;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        n= input.nextInt();
        switch (n){
            case 1:
                System.out.println("На понедельник запланировано занятие по Java");
                break;
            case 2:
                System.out.println("На вторник запланирован масссаж");
                break;
            case 3:
                System.out.println("На среду запланировано занятие по английскому языку");
                break;
            case 4:
                System.out.println("На четверг - занятик по Java-программированию");
                break;
            case 5:
                System.out.println("На пятницу запланирована уборка на участке ");
                break;
            case 6:
                System.out.println("На субботу запланирована встреча с друзьями и посещение сауны");
                break;
            case 7:
                System.out.println("Посещение Храма");
                break;
            default:
                System.out.println("Дня с таким номер не существует");
        }
    }
}
