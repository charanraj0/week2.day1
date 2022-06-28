package classroom;

public class FindTypes {
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] arr = test.toCharArray();
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			if (Character.isLetter(arr[i])) {
				++letter;
			}
			else if (Character.isDigit(arr[i])) {
					++num;
				}
			else if (Character.isSpaceChar(arr[i])) {
				++space;
			}
			else {
				++specialChar;
			}
			// Print the count here
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("specialCharcter: " + specialChar);
		}
	}

}
