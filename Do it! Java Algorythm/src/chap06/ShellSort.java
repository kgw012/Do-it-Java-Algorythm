package chap06;

public class ShellSort {
	
	private static void shellSort(int[] a, int n) {
		for(int h = n/2; h>0; h/=2) {
			for(int i = h; i<n; i++) {
				int j;
				int tmp = a[i];
				for(j=i-h; j>=0 && a[j]>tmp; j-=h) {
					a[j+h] = a[j];
				}
				a[j+h] = tmp;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {1,6,2,4,3,5,3,4,5};
		
		shellSort(a, a.length);
		
		for(int i : a) {
			System.out.println(i);
		}
		
	}

}
