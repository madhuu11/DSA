package main.java;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {50, 60, 10, 40, 30, 20};
		System.out.println("Elements to be sorted are");
		printElements(arr);
		
		InsertionSort(arr);
		
		System.out.println("\n Sorted elements are");
		printElements(arr);
	}

	private static void InsertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

	private static void printElements(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
