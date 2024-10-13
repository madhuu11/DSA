package main.java;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		int key = 5;
		
		//there are 3 methods in binary search ie, Iterative method, Recursive method and In-build method
		int iterativeIndex = IterativeBinarySearch(arr, 0, arr.length-1, key);
		if(iterativeIndex >= 0) {
			System.out.println("Key : "+key+" found at index : "+ iterativeIndex + " using iterative method.");
		}else {
			System.out.println("Element not found.");
		}
		
		int recursiveIndex = recursiveBinarySearch(arr, 0, arr.length-1, key);
		if(recursiveIndex >= 0) {
			System.out.println("Key : "+key+" found at index : "+ recursiveIndex + " using recursive method.");
		}else {
			System.out.println("Element not found.");
		}
		
		int inBuildIndex = Arrays.binarySearch(arr, key);
		if(inBuildIndex >= 0) {
			System.out.println("Key : "+key+" found at index : "+ inBuildIndex + " using in build method.");
		}else {
			System.out.println("Element not found.");
		}
		
	}

	private static int recursiveBinarySearch(int[] arr, int low, int high, int key) {
		if(low<=high) {
			int mid = low+(high-low)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]<key) {
				return recursiveBinarySearch(arr, mid+1, high, key);
			}
			return recursiveBinarySearch(arr, low, mid-1, key);
		}
		return -1;
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
