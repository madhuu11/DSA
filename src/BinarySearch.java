package main.java;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		int key = 5;
		int index = IterativeBinarySearch(arr, 0, arr.length, key);
		System.out.println("Key : "+key+" found at index : "+index + " using iterative method.");
	}

	private static int IterativeBinarySearch(int[] arr, int low, int high, int key) {
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
}
