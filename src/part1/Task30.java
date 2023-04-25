package part1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("0x[a-fA-F0-9]{4}");
        Matcher matcher = pattern.matcher("0x141D12 aaaaalllll 0x7AAF 0x7FFF");
        while (matcher.find())



            System.out.println( "Шестнадцатиричное число:" + " " +matcher.group());


        }








}

