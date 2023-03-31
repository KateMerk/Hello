package myPractice;

public class Task22 {
    public static void main(String[] args) {
        int marks []= {25,65,66,78,55,2,5,99,100,12};
        int sum = 0;
        
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] >= marks[indexOfMax])
                indexOfMax = i;
            else if (marks[i] < marks[indexOfMin])
                indexOfMin = i;
        }
        for (int m = Math.min(indexOfMax, indexOfMin) + 1; m < Math.max(indexOfMax, indexOfMin); m++) {
            sum += marks[m];
        }
        System.out.println(sum);
    }

}
