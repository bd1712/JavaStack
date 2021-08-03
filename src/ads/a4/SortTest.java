package ads.a4;

public class SortTest {

	protected static boolean isSorted(int[] f) {
		for (int i = 0; i < f.length - 1; i++) {
			if (f[i] > f[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
