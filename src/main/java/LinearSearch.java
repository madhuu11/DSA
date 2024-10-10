package main.java;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = new int[] {3, 4, 9, 5, 2};
		int key = 4;
		int n = arr.length-1;
		int index = search(arr, n, key);
		
		if(index == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index : "+index);
		}
	}

	private static int search(int[] arr, int n, int key) {
		for(int i=0; i<n-1; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
