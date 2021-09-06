package Ukesoppgaver.Uke1.Avsnitt113;

public class oppg1135 {
    public static int[] minmaks(int[] a){
        int min = 0, minverdi = a[0];
        int maks = 0, maksverdi = a[0];

        int verdi = 0;

        for(int i = 1; i < a.length; i++){
            verdi = a[i];

            if(verdi > maksverdi){
                maksverdi = verdi;
                maks = i;
            }
            else if(verdi<minverdi){
                minverdi=verdi;
                min=i;
            }
        }
        return new int[]{min,maks};
    }
}
