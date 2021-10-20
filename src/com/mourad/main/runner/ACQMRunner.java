package com.mourad.main.runner;

import java.util.Scanner;

import com.mourad.main.model.AC;
import com.mourad.main.services.QueueServicesImpl;

public class ACQMRunner {

	public static void main(String[] args) {
		aqmRequestProcess();
	}
	
	private static void aqmRequestProcess() {
		int choice = 0;
		QueueServicesImpl queueServices = new QueueServicesImpl();
		Scanner scanner = new Scanner(System.in);
		do {
			menu();
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n\nPlease enter aircraft type:"
						+ "\n1. Type in 'P' For passanger aircraft"
						+ "\n2. Type in 'C' for cargo aircraft"
						+ "\nPlease enter your choice: ");
				scanner = new Scanner(System.in);
				String type = scanner.nextLine().toUpperCase();

				System.out.println("\n\n Please enter aircraft size:"
						+ "\n1. Type in 'S' or small"
						+ "\n2. Type in 'L' for large"
						+ "\nPlease enter your choice: ");
				scanner = new Scanner(System.in);
				String size = scanner.nextLine().toUpperCase();

				AC airCraft = new AC(type, size);
				queueServices.enqueue(airCraft);

				System.out.println(" AirCraft queued succefully.");
				break;

			case 2:
				queueServices.dequeue();
				System.out.println(" AirCraft dequeued succefully.");
				break;

			case 3:
				queueServices.showQueue();
				break;

			case 4:
				System.out.println("\nThanks for using Air-Traffic Control System Application.\n...exiting program");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid input. Please try again!\n");
				continue;
			}
		} while (choice != 4);
	}

	private static void menu() {
		System.out.print("\n\n\t\t*** Air-Traffic Control System App. ***" 
				+ "\n1. Enqueue aircraft"
				+ "\n2. Dequeue aircraft" 
				+ "\n3. Show queue list" 
				+ "\n4. quit" 
				+ "\nPlease enter your choice: ");
	}
}
