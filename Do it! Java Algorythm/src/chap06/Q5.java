package chap06;

public class Q5 {

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	private static void cocktailSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=i; j<n-1; j++) {
				for(int count=0; count<2; count++) {
					if(count == 0) {
						if(a[n-1-j] < a[n-1-j-1]) {
							swap(a, n-1-j, n-1-j-1);
						}
					}
					else {
						if(a[j] > a[j+1]) {
							swap(a, j, j+1);
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {9,1,3,4,6,7,8};
		
		cocktailSort(a, a.length);
		
		for(int i : a) {
			System.out.println(i);
		}
	}

}
