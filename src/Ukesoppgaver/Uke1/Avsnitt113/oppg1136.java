package Ukesoppgaver.Uke1.Avsnitt113;

public class oppg1136 {

    public static long fakultet (int a){
        if(a < 0){
            throw new IllegalArgumentException("a < 0");
        }

        long fakultet = 1;
        for(int i = 2; i <= a; i++){
            fakultet *= i;
        }
        return fakultet;
    }
}
