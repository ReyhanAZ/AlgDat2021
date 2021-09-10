package Ukesoppgaver.Uke2.Avsnitt124;

import Datastrukturer.Tabell;

public class oppg1243 {
    public static int [] nestMaks3(int[] a){

        if (a.length < 2) {// må ha minst to verdier!
            throw new java.util.NoSuchElementException("a.length(" + a.length + ") < 2!");
        }

        int m = Tabell.maks(a);  // m er posisjonen til tabellens største verdi

        Tabell.bytt(a,a.length-1,m); //bytter om slik at den største kommer bakerst

        int k = Tabell.maks(a,0,a.length-1); //finner nest største før siste index

        if ( k == m ){ // den nest sørste lå opprinnelig bakerst
            k = a.length-1;

            Tabell.bytt(a, a.length-1, m); //bytter tilbake
        }

        return new int [] {m,k};

    }
}
