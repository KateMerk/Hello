package part1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task41 {
    public static void main(String[] args) {
        int quantityElements = 10;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<quantityElements; i++){
            int a = (int) (Math.random()*10+1);
            list.add(i, a);
        }

        System.out.println("Collection of numbers: "+list);

        Set<Integer> newList = new HashSet<>(list);

        System.out.println("New collection: "+newList);

    }
}

