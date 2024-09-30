package main.java;

import java.util.Scanner;

public class ArrayProject1 {
	// to find number of days above Average Temperature
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many days temperature : ");
		int numOfDays = sc.nextInt();
		int[] tempAbove = new int[numOfDays];
		int sum = 0;

		for (int i = 0; i < numOfDays; i++) {
			System.out.print("Day " + (i + 1) + "'s temp : ");
			tempAbove[i] = sc.nextInt();
			sum += tempAbove[i];
		}

		double avg = sum / numOfDays;
		System.out.println("Average = " + avg);

		int above = 0;
		for (int i = 0; i < tempAbove.length; i++) {
			if (tempAbove[i] > avg) {
				above++;
			}
		}
		System.out.println(above + " days above temperature");
	}

}
