package ads.a4.aufgabe2;

import ads.a4.InputGenerator;
import ads.a4.SortTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InsertionSortTest extends SortTest {

	private InsertionSort s;

	@BeforeEach
	void setUp() throws Exception {
		s = new InsertionSort();
	}

	@RepeatedTest(10)
	void testCorrectness() {
		int[] a = InputGenerator.randomSequence(25);
		s.sort(a);
		assertTrue(isSorted(a));
	}

	@Test
	void testOptimal() {
		int[] emptyArray = new int[0];
		s.reset();
		s.sort(emptyArray);
		assertEquals(0, s.getCount());
		assertEquals(0, s.getSwap());
		assertEquals(0, s.getComparison());

		int[] testData = InputGenerator.uniformSequence(10, 8);
		s.reset();
		s.sort(testData);
		assertTrue(s.getCount() <= 10);
		assertTrue(s.getSwap() <= 0);
		assertTrue(s.getComparison() <= 9);

		testData = InputGenerator.increasingSequence(10);
		s.reset();
		s.sort(testData);
		assertTrue(s.getCount() <= 10);
		assertTrue(s.getSwap() <= 0);
		assertTrue(s.getComparison() <= 9);

		testData = InputGenerator.decreasingSequence(10);
		s.reset();
		s.sort(testData);
		assertTrue(s.getCount() <= 10);
		assertTrue(s.getSwap() <= 54);
		assertTrue(s.getComparison() <= 45);

		int[] exampleData = { 4, 21, 47, 29, 3, 46, 37, 22, 23, 29 };
		s.reset();
		s.sort(exampleData);
		assertTrue(s.getCount() <= 10);
		assertTrue(s.getSwap() <= 26);
		assertTrue(s.getComparison() <= 27);
	}

}
