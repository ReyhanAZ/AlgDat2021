package Ukesoppgaver.Uke2.Avsnitt124;

import Datastrukturer.Tabell;

public class oppg1244 {
    public static void sortering(int[] a){

        for(int i = a.length; i > 1; i--) {
            int m = Tabell.maks(a, 0, i);
            Tabell.bytt(a,i-1,m);
        }
    }

    //Oblig 1

    public static int antallUlikeSortert(int[] a){

        int count = 0;
        int value = 0;

        if(a.length < 1){
            return 0;
        }

        for (int i = 0; i < a.length; i++){

            if (a[i] >= value){

                if (a[i] != value){
                    count++;
                }
                 value = a[i];
            }
            else {
                throw new IllegalStateException("Arrayet er ikke sortert");
            }
        }
        return count;
    }

    public static int antallUlikeUsortert(int[] a){

        if(a.length < 1){
            return 0;
        }

        int count = a.length;

        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++){
                if(a[i] == a[j]){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
