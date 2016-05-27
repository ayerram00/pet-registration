
package com.sqa.ay;

import java.util.*;

public class PetRegistration {

	static int i = 0;
	static String name;

	static String[] petAddresse;
	static String[] petCity;
	// static String[] petState1;
	static int petCount = 0;
	static String[] petDOB;
	static String[] petName;
	// static String petName;
	// , petAddress, petRegPrice, petDOB, petCity,
	// petState, petcount;
	static String[] petRegPrice;

	static String[] petState;

	static Scanner scanner;

	public static void registerPet() {

		initApplication();

		retrieveUserName();

		howManyPets();

		retrievePetDetails();
		displayPetDetails();

		exitApplication();

	}

	private static void displayPetDetails() {
		for (i = 0; i < petCount; i++) {
			System.out.println("\n Pet Details for pet:" + (i + 1));
			System.out.println("___________________");
			System.out.println("Name: " + petName[i]);
			System.out.println("Address: " + petAddresse[i]);
			System.out.println("City: " + petCity[i]);
			System.out.println("State: " + petState[i]);
			System.out.println("Birthday: " + petDOB[i]);
			System.out.println("Registration Price: " + petRegPrice[i]);
		}
	}

	private static void exitApplication() {
		System.out.println("Thanks for using the pet registration");
		System.out.println("good-bye" + name);
	}

	private static void howManyPets() {
		System.out.println("How many pets do you want to register");
		String input = scanner.nextLine();
		petCount = Integer.parseInt(input);

		petName = new String[petCount];
		petAddresse = new String[petCount];
		petCity = new String[petCount];
		petRegPrice = new String[petCount];
		petDOB = new String[petCount];
		petState = new String[petCount];

	}

	private static void initApplication() {
		scanner = new Scanner(System.in);
		System.out.println("welcome to the pet registration appliation");

	}

	private static String obtainString(String question) {
		System.out.println(question);
		return scanner.nextLine();
	}

	private static void retrievePetDetails() {
		for (i = 0; i < petCount; i++) {
			System.out.println("Enter the details of pet " + (i + 1));

			petName[i] = obtainString("what is your pet's name");
			petAddresse[i] = obtainString("what is" + petName[i] + "'s address");
			petCity[i] = obtainString("what city does he live in");
			petState[i] = obtainString("and the state?");
			petRegPrice[i] = obtainString("registration costs??");
			petDOB[i] = obtainString("what is " + petName[i] + "'s birthday (mm/dd/yyyy):");

		}

		// petName = obtainString("what is your pet's name");
		// petAddress = obtainString("what is" + petName + "'s address");
		// petCity = obtainString("what city does he live in");
		// petState = obtainString("and the state?");
		// petRegPrice = obtainString("registration costs??");
		// petDOB = obtainString("what is " + petName + "'s birthday
		// (mm/dd/yyyy):");

	}

	private static void retrieveUserName() {
		System.out.println("Could you please give me your name");
		name = scanner.nextLine();

	}

}
