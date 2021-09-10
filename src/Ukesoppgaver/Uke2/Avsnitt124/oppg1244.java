package Ukesoppgaver.Uke2.Avsnitt124;

import Datastrukturer.Tabell;

public class oppg1244 {
    public static void sortering(int[] a){

        for(int i = a.length; i > 1; i--) {
            int m = Tabell.maks(a, 0, i);
            Tabell.bytt(a,i-1,m);
        }
    }
}
