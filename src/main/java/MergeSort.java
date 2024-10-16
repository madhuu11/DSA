package main.java;

public class MergeSort {

	public static void merge(int a[], int l, int mid, int h) {
		int i, j, k;
		int n1 = mid - l + 1;
		int n2 = h - mid;
		
		int LeftArray[] = new int[n1];
		int RightArray[] = new int[n2];

		for (i = 0; i < n1; i++)
			LeftArray[i] = a[l + i];
		for (j = 0; j < n2; j++)
			RightArray[j] = a[mid + 1 + j];

		i = 0;
		j = 0; 
		k = l;

		while (i < n1 && j < n2) {
			if (LeftArray[i] <= RightArray[j]) {
				a[k] = LeftArray[i];
				i++;
			} else {
				a[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = RightArray[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(int array[], int low, int high) {
		if (low < high) {

			int mid = (low + high) / 2;
			mergeSort(array, low, mid);
			mergeSort(array, mid + 1, high);
			merge(array, low, mid, high);
		}
	}

	public static void main(String[] args) {
		int[] array = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given arrays:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}

		mergeSort(array, 0, array.length - 1);

		System.out.println("Sorted Arrays");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}

	}

}
