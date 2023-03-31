package myPractice;

public class Task21 {
    public static void main(String[] args) {
        int marks []= {25,65,66,78,55,2,5,99,100,12};
        int maxIn= marks[0];
        int indexForMax= 0;
        for (int i =0;i<marks.length; i++){
            int score= marks[i];
            if (maxIn<score){
                maxIn= score;
                indexForMax=i;
            }
        }

        System.out.println(indexForMax);
    }
}
