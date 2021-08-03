package ads.a4.aufgabe3;

import ads.a4.SortingAlgorithm;

import java.util.Arrays;

/**
 * Aufgabe 3a)
 */
public class MergeSort extends SortingAlgorithm {

    @Override
    public  void sort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }
        int mid = n / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);
        count++;
        sort(left);
        sort(right);
        merge(arr, left, right);

    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int l = 0, r = 0, i = 0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                arr[i++] = left[l++];

            } else {
                arr[i++] = right[r++];
            }
        }
        while (l < left.length) {
            arr[i++] = left[l++];
        }
        while (r < right.length) {
            arr[i++] = right[r++];
        }

    }
}
