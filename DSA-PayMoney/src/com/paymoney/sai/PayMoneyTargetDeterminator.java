package com.paymoney.sai;
import java.util.Scanner;

public class PayMoneyTargetDeterminator {
	int[] transactionList;
	int dailyTarget;
	Scanner input;
	public PayMoneyTargetDeterminator() {
		input = new Scanner(System.in); 
	}
	private void collectTransactionList() {
		System.out.println("Transaction List : ");
		System.out.println("Enter the size of the transaction list: ");
		int transactionListSize = input.nextInt();
		transactionList = new int[transactionListSize];
		for (int i = 0; i<transactionListSize;i++) {
			System.out.printf("Enter the transaction value : %d / %d",(i+1),transactionListSize);
			System.out.println();
			transactionList[i] = input.nextInt();
		}
		
		
	}
	private void collectDailyTarget() {
		System.out.println("Enter the value for daily ");
		dailyTarget = input.nextInt();
	}
	void determineTarget() {
		int currentSumOfTransactionValues = 0;
		boolean dailyTargetAchieved = false;
		int counter = 0;
		for (int i = 0; i < transactionList.length; i++) {
			counter++;
			int transactionValue = transactionList[i];
			currentSumOfTransactionValues = currentSumOfTransactionValues + transactionValue;
			System.out.printf("Current sum of transaction values : %d", currentSumOfTransactionValues);
			System.out.println();
			if (currentSumOfTransactionValues >= dailyTarget) {
				dailyTargetAchieved = true;
				break;
			}
		}
		if(dailyTargetAchieved) {
			System.out.printf("Daily target of %d achieved after %d transactions", dailyTarget, counter);
			System.out.println();
		}else {
			System.out.printf("Daily target of %d not achieved, dailyTarget");
			System.out.println();
		}
	}
	public void determine() {
		collectTransactionList();
		collectDailyTarget();
		determineTarget();
		
	}

}
