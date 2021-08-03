package ads.a4.aufgabe3;

import ads.a4.SortingAlgorithm;

public class QuickSort extends SortingAlgorithm {

    @Override

    public void sort(int[] list) {
        quickSort(list, 0, list.length - 1);

         }

    public  void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            display(list);
            quickSort(list, pivotIndex + 1, last);
            display(list);

        }
    }



    public  int partition(int[] list, int first, int last) {
        int pivot = list[first]; // das erste Element als pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {    //vergleiche
            // Suche vorwarts von links
            while (low <= high && list[low] <= pivot)
                low++;

            // Suche rückwärts von rechts
            while (low <= high && list[high] > pivot)
                high--;

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
              count++;
            }

        }

        while (high > first && list[high] >= pivot)
            high--;

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;

        }
        else {
            return first;
        }

    }

    public static void display(int[] list)
    {
        for (int i = 0; i < list.length; i++)

            System.out.print(list[i] + " ");
        System.out.println("");

    }

}




