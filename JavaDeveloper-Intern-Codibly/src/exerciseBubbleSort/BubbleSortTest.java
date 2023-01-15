package exerciseBubbleSort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class BubbleSortTest {
	// 1. input = [1, 4, 5, 6, 8, 3, 8] result = [1, 3, 4, 5, 6, 8, 8]
	// 2. input = [-9.3, 0.2, 4, 0.1, 5, 9] result = [-9.3, 0.1, 0.2, 4, 5, 9] 
	// 3. input = [] result = [] 
	// 4. input = [null, 5.0001] result = [5.0001] 
	// 5. input = null result = RuntimeException

	@Test
	void testInput1() {
		int input1[] = {1, 4, 5, 6, 8, 3, 8};
		int input[] = BubbleSort.sort(input1);
		assertArrayEquals(input1, input);
	}
	@Test
	void testInput2() {
		double input2[] = {-9.3, 0.2, 4, 0.1, 5, 9};
		double input[] = BubbleSort.sortDouble(input2);
		assertArrayEquals(input2, input);
	}
	@Test
	void testInput3() {
		int input3[] = {};
		int input[] = BubbleSort.sort(input3);
		assertArrayEquals(input3, input);
	}
	@Test
	void testInput4() {
		List<Double> input4 = new ArrayList<>(Arrays.asList(null, 5.0001));	
		List<Double> input = BubbleSort.sortNull(input4);
		assertEquals(input4, input);
	}

}
