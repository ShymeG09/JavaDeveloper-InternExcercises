package exerciseBalancedWordsCounter;

// Note: I didn't know if You want me to test these cases in JUnit or not,
// so the 1st exercise (BubbleSort) is tested with JUnit to prove my skills
// and this exercise (BalancedWordsCounter) is tested via normal-driver class

public class BalancedWordsCounterTest {

	public static void main(String[] args) {

		// 1. testInput1 = “aabbabcccba” result = 28 
		System.out.println("input=aabbabcccba  result=" + new BalancedWordsCounter().count("aabbabcccba"));
		
		// 2. testInput2 = “” result = 0
		System.out.println("input=\"\"  result=" + new BalancedWordsCounter().count(""));
	}

}
