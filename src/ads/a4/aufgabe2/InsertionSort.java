package ads.a4.aufgabe2;

import ads.a4.SortingAlgorithm;

public class InsertionSort extends SortingAlgorithm {

	@Override
	public void sort(int[] f) {

		long bevor=System.currentTimeMillis();
		int temp;
		for (int i = 1; i < f.length; i++) {
			temp = f[i];
			int j = i;
			while (j > 0 && f[j - 1] > temp) {
				comparison++;
				f[j] = f[j - 1];
				j--;
				swap++;
			}
			f[j] = temp;
		}
		System.out.println("Anzahlder comparison der InsertionSort ist "+ comparison);
		System.out.println("Anzahlder swap der InsertionSort ist "+ swap);

		long after=System.currentTimeMillis();
		this.duration =after - bevor;
		System.out.println("Messung der Laufzeit der InsertionSort : " + this.duration);

	}





}

