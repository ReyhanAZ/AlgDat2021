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

    //oppg2

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

    //oppg3

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

    //oppg9

    public static int[] nestMaks(int[] a)
    {
        int n = a.length;     // tabellens lengde
        if (n < 3) throw      // må ha minst 3 verdier
                new java.util.NoSuchElementException("Lengden til arrayet er mindre enn 3");

        int m = 0;      // m er posisjonen til minste verdi
        int nm = 1;     // nm er posisjonen til nest minste verdi
        int n2m = 2;    // n2m er posisjonen til tredje minste verdi

       //bruk metode fra oppgave 8 og sorter de tre første tallene i arrayet

        int minverdi = a[m];                // største verdi
        int nestminverdi = a[nm];           // nest største verdi
        int nest2minverdi = a[n2m];

        for (int i = 3; i < n; i++)
        {
            if(a[i] < nest2minverdi){

                if (a[i] < nestminverdi)
                {
                    if (a[i] < minverdi) { //ny minst

                        n2m = nm;
                        nest2minverdi=a[nm];

                        nm = m;
                        nestminverdi = a[m];     // ny nest minst

                        m = i;
                        minverdi = a[m];         // ny minst
                    }
                    else { // ny nest minst
                        n2m= nm;
                        nest2minverdi= a[n2m];    //Oppdaterer tredjeminst

                        nm = i;
                        nestminverdi = a[nm];     //Oppdaterer nestminst

                    }

                }else { // ny tredje minst
                    n2m=i;
                    nest2minverdi = a[n2m];
                }

            }
        } // for

        return new int[] {m,nm,n2m};    // n i posisjon 0, nm i posisjon 1, n2m i posisjon 2

    }
}
