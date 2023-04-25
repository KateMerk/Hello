package part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        String s = "Пожалуйста,помогите!";
        Pattern slovaPattern = Pattern.compile("(?U)[^\\W_]+");
        Matcher matcherSlova = slovaPattern.matcher(s);
        List<String> slova = new ArrayList<>();
        while (matcherSlova.find()){
            slova.add(matcherSlova.group(0));
        }
        System.out.println(slova);
        System.out.println("Кол-во слов: " + Integer.toString(slova.size()));









}
}



