import java.util.Scanner;
import java.io.*;

class TitleApplier {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name to be titled (caps count): ");
		String name = "name";


		while (name.length() > 1) {
			name = scan.nextLine();
			if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
				name = "Ms." + name;
			} else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
				name = "Mr." + name;
			}

			System.out.println(name);
		}
	}
}