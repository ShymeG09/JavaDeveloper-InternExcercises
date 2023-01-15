package exerciseBalancedWordsCounter;

// TODO:
// definition: The word is balanced if every letter that occurs in it occurs in the same number of time. 
// E.g. the words: “mama”, “ear”, “aabbcbcccbaa” are balanced 
// but the words “dad”, “elephant”, “abcba” are not. 
// Additionally, the balanced word is not empty.

//	Exercise 2: Create a “BalancedWordsCounter” class with one public method called “count” 
//	which has to count how many balanced subwords exist in the input word. 
//	method should receive String (parameter name = “input”) 
//	method should return Integer 
//  the input should contain the letters only, 
//	throw an exception if the text contains other characters. 
//	if the input is null then method should throw an exception 
//	Create a “BalancedWordsCounterTest” and create a test methods for below cases: 
//	input = “aabbabcccba” result = 28 
//	input = “” result = 0 
//	input = “abababa1” result = RuntimeException 
//	input = null result = RuntimeException

public class BalancedWordsCounter {

	public int count(String input) {
		
		int counter = 0;
		
		for(int i = 1; i <= input.length(); i++) {
			for(int j = 0; j <= input.length(); j++) {
				if(input.length() >= j + i) {
					counter += check(input.substring(j, j + i));
				} else break;
			}
		}
		return counter;
	}
	
	// additional method for finding the occurance of character in input, if it's correct then return 1
	private int check(String substring) {
		
		int occurCounter =- 1;
		
		for(int i = 0; i < substring.length(); i++) {
			char someChar = substring.charAt(i);
			int count = 0;
				for(int j = 0; j < substring.length(); j++) {
					if(substring.charAt(j) == someChar) {
						count++;
					}
				}
				if(occurCounter == -1)
					occurCounter = count;
				else if(occurCounter != count)
					return 0;
		} 
		return 1;
	}
	
}
