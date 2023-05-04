package part1;

import java.util.ArrayList;

public class Task42 {
    public static void main(String[] args) {
        int quantityElements = 10;
        int max = 0;

        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < quantityElements; i++) {
            int a = (int) (Math.random() * 10 + 1);
            marks.add(i, a);
        }
        System.out.println("Marks of students: " + marks);

        for (Integer i : marks) {
            if (i > max) {
                max = i;
            }

        }
        System.out.println("Maximum rating: " + max);

    }
}

