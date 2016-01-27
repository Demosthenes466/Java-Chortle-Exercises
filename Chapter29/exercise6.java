import java.io.*;
import java.util.Scanner;

class PasswordChecker {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		boolean capital = false;
		boolean digit = false;
		boolean correct = false;

		while (!correct) {
			System.out.println("Enter your password: ");
			String password = input.next();

			if ((password.length() > 7)) {
				for (int j = 0; j < password.length(); j ++) {
					if (Character.isUpperCase(password.charAt(j))) {
						capital = true;
					} else if (Character.isDigit(password.charAt(j))) {
						digit = true;
					}
				}
				if (capital && digit) {
					System.out.println("Acceptable Password");
					correct = true;
				} else {
					System.out.println("That password is not acceptable");
				}
			} else {
				System.out.println("That password is not acceptable");
			}	
	}
}
}