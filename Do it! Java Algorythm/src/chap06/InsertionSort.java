package chap06;

public class InsertionSort {
	
	private static void insertionSort(int[] a , int n) {
		for(int i=1; i<n; i++) {
			int j;
			int tmp = a[i];
			for(j=i; j>0 && a[j-1]>tmp; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	public static void main(String[] args) {
		int[] a = {1,6,2,4,3,5,3,4,5};
		
		insertionSort(a, a.length);
		
		for(int i : a) {
			System.out.println(i);
		}
	}

}
