package chap06;

public class Partition {

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	private static void partition(int[] a, int n) {
		int pl = 0;
		int pr = n-1;
		int x = a[n/2];
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr++;
			if(pl<=pr) {
				swap(a, pl++, pr--);
			}
		} while(pl<=pr);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
