import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean continueLoop = true;
		boolean validInput = false;
		int userNum = 0;
		String input = "";

		while (continueLoop) {

			System.out.println("Learn your squares and cubes!");
			System.out.println("Please enter a whole number:");

			// this is my input validation code/ loop
			while (!validInput) {

				if (scnr.hasNextInt()) {
					userNum = scnr.nextInt();
					validInput = true;
					// System.out.println(validInput);
				} else {
					System.out.println("There was an error. Please enter a whole number:");
					// this prevents the infinite loop and discards the bad entry
					scnr.next();

				}

			}

			System.out.printf("%-10s %-10s %-10s%n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s%n", "======", "=======", "=====");
			for (int i = 0; i < userNum; i++) {
				System.out.printf("%-10s %-10s %-10s%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
			}

			System.out.println("Would you like to continue? y/n");
			String answer = scnr.next();
			if (answer.equals("y")) {
				continueLoop = true;
				validInput = false;
			} else {
				continueLoop = false;
				System.out.println("Thanks and goodbye!");
			}
		}
		scnr.close();

	}

}
