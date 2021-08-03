package ads.a4.aufgabe3;

import ads.a4.InputGenerator;

public class Benchmarking {

    /**
     * Aufgabe 3d)
     *
     * Hier soll die Anzahl der Vergleiche, die Anzahl der Vertauschungen, die
     * Ausfuehrungszeit und ggf. die Rekursionstiefe fuer die drei fortgeschrittenen
     * Sortierverfahren gemessen werden.
     *
     * Eingabefolgen verschiedener Art und Groesse koennen mit den statischen
     * Methoden in {@link ads.a4.InputGenerator} erzeugt werden.
     *
     * Wiederholen Sie jeden Versuch 10 Mal und bilden Sie Mittelwerte.
     */
    public static void main(String[] args) {
        int[] zehn = InputGenerator.randomSequence(10);
        int[] hundert = InputGenerator.randomSequence(100);
        int[] tausend = InputGenerator.randomSequence(1000);
        int[] ztausend = InputGenerator.randomSequence(10000);
        int[] zwtausend = InputGenerator.randomSequence(20000);


        HeapSort s0 = new HeapSort();
        s0.sort(zehn);
        System.out.println(" Count "+ s0.getCount());
        System.out.println("hundert");

        HeapSort s1 = new HeapSort();
        s1.sort(hundert);
       System.out.println(" Count "+ s1.getCount());
        System.out.println("tausend");

        HeapSort s2 = new HeapSort();
        s2.sort(tausend);
        System.out.println(" Count "+ s2.getCount());
        System.out.println("ztausend");

        HeapSort s3 = new   HeapSort();
        s3.sort(ztausend);
        System.out.println(" Count "+ s3.getCount());
        System.out.println("zwtausend");

        HeapSort s4 = new   HeapSort();
        s4.sort(zwtausend);
        System.out.println(" Count "+ s4.getCount());
        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////
        MergeSort m0 = new MergeSort();
        m0.sort(zehn);
        System.out.println(" Count merge "+ m0.getCount());
        System.out.println("hundert");

        MergeSort m1 = new MergeSort();
        m1.sort(hundert);
        System.out.println(" Count "+ m1.getCount());
        System.out.println("tausend");

       MergeSort m2 = new MergeSort ();
        m2.sort(tausend);
        System.out.println(" Count "+ m2.getCount());
        System.out.println("ztausend");

        MergeSort  m3 = new   MergeSort ();
        m3.sort(ztausend);
        System.out.println(" Count "+ m3.getCount());
        System.out.println("zwtausend");

        MergeSort  m4 = new   MergeSort ();
        m4.sort(zwtausend);
        System.out.println(" Count "+ m4.getCount());

        System.out.println();


        /////////////////////////////////////////////////////////////////

        /*QuickSort q0 = new QuickSort();    //es lauft
        q0.sort(zehn);
        System.out.println(" Count merge "+ q0.getCount());
        System.out.println("hundert");

        QuickSort q1 = new QuickSort();
        q1.sort(hundert);
        System.out.println(" Count "+ q1.getCount());
        System.out.println("tausend");

        QuickSort q2 = new QuickSort ();
        q2.sort(tausend);
        System.out.println(" Count "+ q2.getCount());
        System.out.println("ztausend");

        QuickSort  q3 = new   QuickSort ();
        q3.sort(ztausend);
        System.out.println(" Count "+ q3.getCount());
        System.out.println("zwtausend");

        QuickSort  q4 = new   QuickSort ();
        q4.sort(zwtausend);
        System.out.println(" Count "+ q4.getCount());
*/
    }

}


