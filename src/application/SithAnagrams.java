package application;

import java.util.Arrays;

public class SithAnagrams {
	public static void main(String[] args) {
		String word1 = "gfdsa act TT";
		String word2 = "cat tt asdfg";

		boolean areAnagram = areAnagrams(word1, word2);

		if (areAnagram)
			System.out.println("It's a anagram");
		else
			System.out.println("It's not a anagram");

	}

	public static boolean areAnagrams(String word1, String word2) {

		word1 = word1.replace(" ", "");
		word2 = word2.replace(" ", "");

		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();

		char[] word1Chars = word1.toCharArray();
		char[] word2Chars = word2.toCharArray();

		Arrays.sort(word1Chars);
		Arrays.sort(word2Chars);

		boolean areAnagram = false;

		if (Arrays.equals(word1Chars, word2Chars))
			areAnagram = true;

		return areAnagram;
	}
}