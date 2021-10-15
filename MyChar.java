package com.siddhi.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			return true;
		return false;
	}

	public boolean isNumber() {
		if (ch >= 48 && ch <= 57)
			return true;
		return false;
	}

	public boolean isAlphabet() {
		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
			return true;
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel())
			return true;
		return false;

	}

}
