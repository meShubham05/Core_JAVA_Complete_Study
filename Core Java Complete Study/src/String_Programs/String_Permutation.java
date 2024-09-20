package String_Programs;

public class String_Permutation {

	public static void findPermutations(String str, String ans) {
	        // Base case: if the string is empty
	        if (str.length() == 0) {
	            System.out.println(ans);
	            return;
	        }

	        // Iterate over the string
	        for (int i = 0; i < str.length(); i++) {
	           char currentChar = str.charAt(i);

	           String remaining = str.substring(0, i) + str.substring(i + 1);

	            findPermutations(remaining, ans + currentChar);
	        }
	    }

	    public static void main(String[] args) {
	        String s = "ABC";
	        findPermutations(s, "");
	    }
	}


