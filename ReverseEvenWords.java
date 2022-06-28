package classroom;

import java.util.Arrays;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] str1Array = test.split(" ");
		int length = str1Array.length;
		for (int i = 0; i < length; i++) {
			if (i %2 != 0) {
				char[] charArray = str1Array[i].toCharArray();
				
				for (int j = charArray.length-1; j >=0; j--) {
					System.out.print(charArray[j]);
					
				}
				System.out.print(" ");
		}
		else {
		System.out.print(str1Array[i] + " ");
		}
	}
	}
}
