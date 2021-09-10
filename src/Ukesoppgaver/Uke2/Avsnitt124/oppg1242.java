package Ukesoppgaver.Uke2.Avsnitt124;

import Datastrukturer.Tabell;

public class oppg1242 {
    public static int [] nestMaks2(int[] a){

        if (a.length < 2) {// må ha minst to verdier!
            throw new java.util.NoSuchElementException("a.length(" + a.length + ") < 2!");
        }

        int m = Tabell.maks(a);  // m er posisjonen til tabellens største verdi

        Tabell.bytt(a,0,m); //bytter om slik at den største kommer forrest

        int k = Tabell.maks(a,1,a.length); //finner nest største etter index 0

        if ( k == m ){ // den nest sørste lå opprinnelig forrest
            k = 0;

            Tabell.bytt(a, 0, m); //bytter tilbake
        }

        return new int [] {m,k};

    }
}
