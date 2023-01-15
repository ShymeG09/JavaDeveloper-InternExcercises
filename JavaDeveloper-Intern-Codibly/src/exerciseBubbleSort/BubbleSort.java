package exerciseBubbleSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO:
// Exercise 1: Bubble sort Create a “BubbleSort” class with one public method called “sort” 
// which has to sort numbers in accordance with the “Bubble sort” algorithm. 
// method should receive List of Comparable (parameter name = “input”) 
// method should return List of Comparable, 
// but the numbers should be sorted ascending if the input is null then method should throw an exception 
// if the input contains null value in list then method should omit this element 
// Create a “BubbleSortTest” class and create test methods for below cases: 
// input = [1,4,5,6,8,3,8] result = [1,3,4,5,6,8,8] 
// input = [-9.3,0.2,4,0.1,5,9] result = [-9.3,0.1,0.2,4,5,9] 
// input = [] result = [] 
// input = [null,5.0001] result = [5.0001] 
// input = null result = RuntimeException

public class BubbleSort {
	
	public static int[] sort(int[] input) {
		
		int position;
		boolean swap;
		
		for(int i = 0; i < input.length - 1; i++) {
			swap = false;
			for(int j = 0; j < input.length - i - 1; j++) {
				if(input[j] > input [j +1]) {
					position = input[j];
					input[j] = input[j + 1];
					input[j + 1] = position;
					swap = true;
				}
			}
			if(swap == false) {
				break;
			}
		}
		System.out.println("Result: " + Arrays.toString(input));
		return input;
	}

	// additional method for sorting numbers (type: Double)
	protected static double[] sortDouble(double[] input) {
			
		double position;
		boolean swap;
			
		for(int i = 0; i < input.length - 1; i++) {
			swap = false;
			for(int j = 0; j < input.length - i - 1; j++) {
				if(input[j] > input [j + 1]) {
					position = input[j];
					input[j] = input[j + 1];
					input[j + 1] = position;
					swap = true;
				}
			}
			if(swap == false) {
				break;
			}
		}
		System.out.println("Result: " + Arrays.toString(input));
		return input;
	}
	// additional method for removing null values
	protected static List<Double> sortNull(List<Double> input) {
		   
		if(input.contains(null)) {
			input.removeAll(Collections.singletonList(null));
			}
		System.out.println("Result: " + input);
		return input;
	}
	
}
