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
		
		// 3. testInput3 = “abababa1” result = RuntimeException
		try {
			System.out.println("input=abababa1  result=" + new BalancedWordsCounter().count("abababa1"));
		} catch (Exception e) {
			System.out.println("input=abababa1  result=" + e.getMessage());
		}
		
		// 4. testInput3 = null result = RuntimeException
		try {
			System.out.println("input=null  result=" + (new BalancedWordsCounter().count(null)));
		} catch (Exception e) {
			System.out.println("input=null  result=" + e.getMessage());
		}
	}

}
