package chap06;

public class BubbleSort {
	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	private static void bubbleSort(int[]a , int n) {
		int k = 0;
		while(k<n-1) {
			int count = 0;
			int last = n-1;
			for(int j=n-1; j>k; j--) {
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
					count++;
					last = j;
				}
			}
			if(count == 0) break;
			k = last;
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3,5,4,1,2,5,6};
		
		bubbleSort(a, a.length);
		
		for(int i : a) {
			System.out.println(i);
		}
	}
}
