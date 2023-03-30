package lesson4;

public class Task6 {
    public static void main(String[] args) {
        int s = 365;
        int sec;
        int m;
        int min;
        int h,day,week;
        sec = s%60;
        m= (s-sec)/60;
        min=m%60;
        h=(m-min)/60;
        day= h/24;
        week= day/7;
        System.out.println( "Недель"+ " "+ week+";" +" "+ "Количество дней"  +" "+day+"; "+   h+" "+"часа"+";" +min+" "+ "минут"+";" +sec+"секунд" );



    }
}
