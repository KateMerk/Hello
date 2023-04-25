package part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        String str = "Вывести текст, составленный из последних букв всех слов asd";
        String regexp = "([а-яА-Я]+)|([a-zA-Z]+)";
        StringBuilder rezult = new StringBuilder();

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(str);
        int count=0;

        while (matcher.find()) {
            rezult.append(str.substring(matcher.end() - 1, matcher.end()));
        }

        System.out.println(rezult);
    }

}

