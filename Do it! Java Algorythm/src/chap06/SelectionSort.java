package chap06;

public class SelectionSort {

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	private static void selectionSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, i, min);
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,6,7,4,6,3,5,3};
		
		selectionSort(a, a.length);
		
		for(int i : a) {
			System.out.println(i);
		}
	}

}
