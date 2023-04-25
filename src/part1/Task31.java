package part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task31 {
    public static void main(String[] args) {
        String str="0x7FFF <p id=p1> 0x7AAF <p id=p1> kkkk  khg gkhjg";
        System.out.println(str.replaceAll("<p id=p1>", "<p>"));
        Pattern p=Pattern.compile(str);
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m);

        }
    }
}
