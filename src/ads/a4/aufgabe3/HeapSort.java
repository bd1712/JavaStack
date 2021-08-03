package ads.a4.aufgabe3;

import ads.a4.SortingAlgorithm;

/**
 * Aufgabe 3c)
 */
public class HeapSort extends SortingAlgorithm {

    @Override
    public void sort(int[] f) {
        int n =f.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(f, n, i);

        // Nacheinander ein Element aus dem Heap extrahieren   -извлекаем по одному элемент
        for (int i = n - 1; i > 0; i--) {
            // Aktuellen Stamm ans Ende verschieben
            int temp = f[0];
            f[0] = f[i];
            f[i] = temp;

            // call max heapify auf dem reduzierten Heap -вызовите max heapify в уменьшенной куче
            heapify(f, i, 0);

        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
        count++;
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;


            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}


