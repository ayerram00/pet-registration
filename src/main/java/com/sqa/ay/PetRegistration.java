
package com.sqa.ay;

import java.util.*;

public class PetRegistration {

	static String name;

	static String petName, petAddress, petRegPrice, petDOB, petCity, petState;
	static Scanner scanner;

	public static void registerPet() {
		initApplication();
		retrieveUserName();
		retrievePetDetails();
		displayPetDetails();
		exitApplication();

	}

	private static void displayPetDetails() {
		System.out.println("\n Pet Details:");
		System.out.println("___________________");
		System.out.println("Name: " + petName);
		System.out.println("Address: " + petAddress);
		System.out.println("City: " + petCity);
		System.out.println("State: " + petState);
		System.out.println("Birthday: " + petDOB);
		System.out.println("Registration Price: " + petRegPrice);

	}

	private static void exitApplication() {
		System.out.println("Thanks for using the pet registration");
		System.out.println("good-bye" + name);
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
		petName = obtainString("what is yout pet's name");
		petAddress = obtainString("what is" + petName + "'s address");
		petCity = obtainString("what city does he live in");
		petState = obtainString("and the state?");
		petRegPrice = obtainString("registration costs??");
		petDOB = obtainString("what is " + petName + "'s birthday (mm/dd/yyyy):");
	}

	private static void retrieveUserName() {
		System.out.println("Could you please give me your name");
		name = scanner.nextLine();

	}

}
