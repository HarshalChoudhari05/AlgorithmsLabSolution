package com.greatlearning.lab;

import java.util.Scanner;

public class CurrencyDenominations {

	public static void main(String[] args) {

		
		Scanner scanner =  new Scanner(System.in);
		MergeSortImplementation mergeSort = new MergeSortImplementation();
		
		System.out.println("Enter the number of Denominations");
		
		int arrSize = scanner.nextInt();
		//Take input for no.of currency denominations
		
		int[] denominationsArray = new int [arrSize];
		int[] numNotes = new int[arrSize];
		// take amount needs to be paid
		
		System.out.println("Enter the denominations");
		for(int i = 0; i < denominationsArray.length ; i++) {
			denominationsArray[i] = scanner.nextInt();
		}
		
		
		//sort the array of denominations in descending order
		
		mergeSort.sort(denominationsArray, 0, arrSize - 1);
		for(int i = 0 ; i < denominationsArray.length ; i++) {
			System.out.println("Sorted Array is : " + denominationsArray[i]);
		}
		
		//divide the amount by biggest denomination
		System.out.println("Enter the amount to be paid");
		int amount = scanner.nextInt();
		
		int noteCount = 0;
		
		for(int j = 0; j< denominationsArray.length; j++) {
				noteCount = (int)(amount/denominationsArray[j]);
				numNotes[j] = noteCount;
				amount = amount - (denominationsArray[j] * noteCount);
								
				if(j == denominationsArray.length -1 && amount != 0) {
					System.out.println("Denomination Not Found");
				} else if( j == denominationsArray.length -1 && amount ==0) {
					for(int k = 0 ; k < numNotes.length; k++) {
						System.out.println(denominationsArray[k] + " : " + numNotes[k]);
					}
				}
		}

	}

}
