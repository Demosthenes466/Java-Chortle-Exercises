import java.util.Scanner;
import java.io.*;

class Stripper {
	public static void main( String[] args ) {
		Scanner input = new Scanner(System.in);
		boolean print = false;

		while (input.hasNextLine()) {
			String line = input.nextLine();

			if (line.startsWith("//")) {
				System.out.println(line);
			} else if (line.startsWith("/*")) {
				print = true;
			} else if (line.startsWith("*/")) {
				print = false;
			}
			if (print) {
				System.out.println(line);
			}
		}


	}
}