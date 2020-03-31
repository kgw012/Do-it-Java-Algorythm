package chap06;

public class Q1 {
	
	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	private static void bubbleSort(int[] a, int n) {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,4,5,2,4,6,7};
		bubbleSort(a, a.length);
		
		for(int i : a) {
			System.out.println(i);
		}
	}
}
