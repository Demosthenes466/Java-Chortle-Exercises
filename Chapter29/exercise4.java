import java.util.Scanner;
import java.io.*;

class Microwave {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter cook time: ");

		String numbers = scan.nextLine();
		if (numbers.length() < 3) {
			System.out.println("Your Time: 0:" + numbers);
		} else if (numbers.length() == 3) {
			System.out.println("Your Time: " + numbers.charAt(0) + ":" + numbers.substring(1) );
		} else {
			System.out.println("Your Time: " + numbers.charAt(0) + numbers.charAt(1) + ":" + numbers.substring(2));
		}
	}
}