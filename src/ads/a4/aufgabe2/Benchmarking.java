package ads.a4.aufgabe2;

import static ads.a4.InputGenerator.randomSequence;

public class Benchmarking {
    /**
     * Aufgabe 2b)
     * <p>
     * Hier soll die Anzahl der Vergleiche, die Anzahl der Vertauschungen und die
     * Ausfuehrungszeit fuer die drei einfachen Sortierverfahren gemessen werden.
     * <p>
     * Eingabefolgen verschiedener Art und Groesse koennen mit den statischen
     * Methoden in {@link ads.a4.InputGenerator} erzeugt werden.
     * <p>
     * Wiederholen Sie jeden Versuch 10 Mal und bilden Sie Mittelwerte.
     */
    public static void main(String[] args) {
        int[] zehn = randomSequence(10);
        int[] hundet = randomSequence(100);
        int[] tausend = randomSequence(1000);
        int[] ztausend = randomSequence(10000);
        int[] zwtausend = randomSequence(20000);


        BubbleSort s1 = new  BubbleSort();
        s1.sort(hundet);
        System.out.println(" Tausch "+ s1.getSwap());
        System.out.println(" Vergleich "+ s1.getComparison());
        System.out.println(" Zeit "+ s1.getDuration());
        System.out.println("tausend");

        BubbleSort s2 = new  BubbleSort();
        s2.sort(tausend);
        System.out.println(" Tausch "+ s2.getSwap());
        System.out.println(" Vergleich "+ s2.getComparison());
        System.out.println(" Zeit "+ s2.getDuration());
        System.out.println("ztausend");

        BubbleSort s3 = new  BubbleSort();
        s3.sort(ztausend);
        System.out.println(" Tausch "+ s3.getSwap());
        System.out.println(" Vergleich "+ s3.getComparison());
        System.out.println(" Zeit "+ s3.getDuration());
        System.out.println("zwtausend");

        BubbleSort s4 = new  BubbleSort();
        s4.sort(zwtausend);
        System.out.println(" Tausch "+ s4.getSwap());
        System.out.println(" Vergleich "+ s4.getComparison());
        System.out.println(" Zeit "+ s4.getDuration());


        System.out.println();

        InsertionSort i1 = new  InsertionSort();
        i1.sort(hundet);
        System.out.println(" Tausch "+ i1.getSwap());
        System.out.println(" Vergleich "+ i1.getComparison());
        System.out.println(" Zeit "+ i1.getDuration());
        System.out.println("tausend");

        InsertionSort i2 = new  InsertionSort();
        i2.sort(tausend);
        System.out.println(" Tausch "+ i2.getSwap());
        System.out.println(" Vergleich "+ i2.getComparison());
        System.out.println(" Zeit "+ i2.getDuration());
        System.out.println("ztausend");

        InsertionSort i3 = new  InsertionSort();
        i3.sort(ztausend);
        System.out.println(" Tausch "+ i3.getSwap());
        System.out.println(" Vergleich "+ i3.getComparison());
        System.out.println(" Zeit "+ i3.getDuration());
        System.out.println("zwtausend");

        InsertionSort i4 = new  InsertionSort();
        i4.sort(zwtausend);
        System.out.println(" Tausch "+ i4.getSwap());
        System.out.println(" Vergleich "+ i4.getComparison());
        System.out.println(" Zeit "+ i4.getDuration());

        System.out.println();

        SelectionSort p2 = new  SelectionSort();
        p2.sort(tausend);
        System.out.println(" Tausch "+ p2.getSwap());
        System.out.println(" Vergleich "+ p2.getComparison());
        System.out.println(" Zeit "+ p2.getDuration());
        System.out.println("ztausend");

        SelectionSort p3 = new  SelectionSort();
        p3.sort(ztausend);
        System.out.println(" Tausch "+ p3.getSwap());
        System.out.println(" Vergleich "+ p3.getComparison());
        System.out.println(" Zeit "+ p3.getDuration());
        System.out.println("zwtausend");

        SelectionSort p4 = new  SelectionSort();
        p4.sort(zwtausend);
        System.out.println(" Tausch "+ p4.getSwap());
        System.out.println(" Vergleich "+ p4.getComparison());
        System.out.println(" Zeit "+ p4.getDuration());
    }
}
