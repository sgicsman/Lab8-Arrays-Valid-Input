import java.util.Scanner;

public class Lab8ArraysValidInput {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String[] names = { "Krzysztof", "Star", "Mike", "Schuyler", "Norvell", "Derek", "Luke" }; // SHORTCUT -- CREATES
																									// + FILLS a new
																									// array in one
																									// statement

		String[] hometowns = { "Gdansk", "Birmingham", "Detroit", "Bloomfield Hills", "Redford", "Akron",
				"Port Huron" };

		String[] favFoods = { "pierogi", "lobster thermador", "pizza", "veal parmigiana", "chile relleno", "espresso",
				"steak" };

		System.out.println("Welcome to our Java class. Here is a list of our students:");

		for (int i = 0; i < names.length; i++)
			System.out.println(i + 1 + " " + names[i]);

		String continueCmd = "yes"; //need to change this to a boolean: set as true here, then use validator to set to false for "no" input
		while (continueCmd == "yes") {

			String userPrompt = "Please choose a student about whom to learn more by entering a number between 1 and 7.";

			// uses Validator method to account for invalid user input (needs integer within
			// a specified range)
			int userChoice = Validator.getInt(scnr, userPrompt, 1, 7);

			System.out.println("You've chosen " + names[userChoice - 1] + ". What would you like to know more about "
					+ names[userChoice - 1] + "?");

			String userPrompt2 = "Type and enter \"favorite food\" or \"hometown\"";
			String studentInfo = Validator.getStringMatchingRegex(scnr, userPrompt2, "(hometown)|(favorite food)");

			if (studentInfo.equalsIgnoreCase("favorite food")) {
				System.out.println(names[userChoice - 1] + "'s favorite food is " + favFoods[userChoice - 1] + ".");

			} else {
				System.out.println(names[userChoice - 1] + "'s hometown is " + hometowns[userChoice - 1] + ".");

			}
			scnr.nextLine(); // clear the scanner
			String userPrompt3 = "Would you like to learn about another of our students? Please enter \"yes\" or \"no\".";
			String userDecision = Validator.getStringMatchingRegex(scnr, userPrompt3, "(yes)|(no)");
			//here's where I need to set continueCmd to true or false (probably use equalsIgnoreCase.)

		}
		System.out.println("Thank you for your interest.");
		scnr.close();

	}

}
