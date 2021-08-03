package ads.a4.aufgabe2;

import ads.a4.SortingAlgorithm;

public class BubbleSort extends SortingAlgorithm {

	@Override
	/*public void sort(int[] f) {
		long duration = currentTimeMillis();
		int n = f.length;


		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (f[j] > f[j + 1]) {
					// swap f[j+1] and f[j]
					int temp = f[j];
					f[j] = f[j + 1];
					f[j + 1] = temp;
					swap++;
					comparison++;
				} else {
					comparison++;

				}
			duration-=currentTimeMillis();
	}
}*/
	public void sort(int[] f) {

		long bevor = System.currentTimeMillis();


		int i, j, n = f.length;
		for (i = 0; i < n - 1; i++)

			// Last i elements are already in place
			for (j = 0; j < n - i - 1; j++) {

				if (f[j] > f[j + 1]) {

					int temp = f[j];
					f[j] = f[j + 1];
					f[j + 1] = temp;
					swap++;
					comparison++;
				} else {
				//	comparison++;
				}
			}
		System.out.println("Anzahlder comparison der BubbleSort ist " + comparison);
		System.out.println("Anzahlder swap der BubbleSort ist " + swap);


		long after = System.currentTimeMillis();
		this.duration = after - bevor;
		System.out.println("Messung der Laufzeit der BubbleSort : " + this.duration);


	}
}