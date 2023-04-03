package part1;

import java.util.Arrays;

public class Task23 {

    public static void main(String[] args) {
        int[] array = {1, 4, 9, 16, 25};
        System.out.println("Array before reverse : " + Arrays.toString(array));

        arrayReverse(array);
        System.out.println("Array after reverse : " + Arrays.toString(array));


    }

    static void arrayReverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
