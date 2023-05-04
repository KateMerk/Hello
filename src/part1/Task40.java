package part1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Task40 {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> marks= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = (int)(1+Math.random() * 10);
            marks.add( m);
        }
        System.out.println(marks);

        ArrayList<Integer>badmarks=new ArrayList<>();
        for (int i=0; i<n; i++){
            int badmark=marks.get(i);
            if (badmark<3){
                badmarks.add(badmark);
            }
        }
        marks.removeAll(badmarks);
        System.out.println(marks);
    }


}


