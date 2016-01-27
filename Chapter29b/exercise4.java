import java.io.*;
import java.util.Scanner;

class SecretCode {
	public static void main(String[] args) {
		Scanner file = new Scanner(System.in);
		String phrase = file.nextLine();
		int[] numbers = new int[100];
		int i = 0;
		int count = 0;
		String code = "";
		while(file.hasNextInt()) {
			numbers[i++] = file.nextInt();
			count += 1;
		}
		int[] decode = new int[count];
		System.arraycopy(numbers, 0, decode, 0, count);

		for (int j = 0; j < decode.length; j++) {
			code += phrase.charAt(decode[j]);
		}

		System.out.println(code);
	}
}
