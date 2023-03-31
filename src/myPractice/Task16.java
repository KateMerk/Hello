package myPractice;

public class Task16 {
    public static void main(String[] args) {
        boolean b = true;
        for (int P = 50;P<=70;P++ ){
            for (int i = 2;i<P;i++){
                if (P%i==0){
                    b= false;
                    break;
                }
            }
            if (b) System.out.println(P);
            else b=true;
        }
    }
}
