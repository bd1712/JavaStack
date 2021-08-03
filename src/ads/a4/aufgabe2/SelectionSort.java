package ads.a4.aufgabe2;

import ads.a4.SortingAlgorithm;

public class SelectionSort extends SortingAlgorithm {

    @Override
    /*public void sort(int[] f) {
        int n = f.length;


        for (int i = 0; i < n-1; i++) {

            int min_idx = i;                             // Find the minimum element in unsorted array
            for (int j = i + 1; j < n; j++)
                if (f[j] < f[min_idx])
                    min_idx = j;

                    int temp = f[min_idx];               // Swap the found minimum element with the first element
                    f[min_idx] = f[i];
                    f[i] = temp;
        }
    }
}*/
    public void sort(int[] f) {

        long bevor=System.currentTimeMillis();
        int i, j, min_idx;
        int n = f.length;
        // One by one move boundary of unsorted subfay
        for (i = 0; i < n; i++) {
            // Find the minimum element in unsorted fay
            min_idx = i;
            for (j = i + 1; j < n; j++) {
                if (f[j] < f[min_idx]) {
                    min_idx = j;
                    comparison++;
                }
            }

            if (f[min_idx] == f[i])
                continue;
            int temp = f[min_idx];
            f[min_idx] = f[i];
            f[i] = temp;
            swap++;

        }
        System.out.println("Anzahlder comparison der SelectionSort ist "+ comparison);
        System.out.println("Anzahlder swap der SelectionSort ist "+ swap);
        long after=System.currentTimeMillis();
        this.duration =after - bevor;
        System.out.println("Messung der Laufzeit der SelectionSort : " + this.duration);

    }



}
