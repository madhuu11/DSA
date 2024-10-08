package main.java;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = sc.nextInt();
		System.out.println("Enter the array elements to be sorted");
		int[] arr = new int[10];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		selectionSort(arr, n);
		
		System.out.println("sorted elements are");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void selectionSort(int[] arr, int n) {
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[min]) {
					min =j;
				}
			}
			if(min!=i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
