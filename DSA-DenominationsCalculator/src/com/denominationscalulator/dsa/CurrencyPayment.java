package com.denominationscalulator.dsa;
import java.util.Arrays;
import java.util.Scanner;

public class CurrencyPayment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations:");
		int size = scan.nextInt();
		System.out.println("Enter the currency denominations values: ");
		int[] denominations = new int[size];
		for (int i = 0; i<size; i++) {
			denominations[i] = scan.nextInt();
		}
		System.out.println("Enter the amount you want to pay:");
		int amountToPay = scan.nextInt();
		Arrays.sort(denominations);
		reverseArray(denominations);
		calculateMinimumNotes(denominations, amountToPay);
		

	}
	private static void reverseArray(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start< end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		}
	
	private static void calculateMinimumNotes(int[] denominations, int amount) {
		System.out.println("Your payment approach in order to give the minimum nuber of notes will be: ");
		for (int denomination : denominations) {
			if (amount>=denomination) {
				int count = amount / denomination;
				System.out.println(denomination + ":" + count);
				amount %= denomination;
			}
		}
		
	}

}
