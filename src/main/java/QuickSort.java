package main.java;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {8, 3, 2, 1, 7};
		int n = arr.length;
		
		quickSort(arr, 0, n -1 );
		
		System.out.println("Sorted Array : ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j=low; j<=high-1; j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return i+1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
