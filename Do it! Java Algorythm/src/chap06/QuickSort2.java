package chap06;

import java.util.Stack;

public class QuickSort2 {
	
	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	private static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr)/2];
		
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr) {
				swap(a, pl++, pr--);
			}
		} while(pl<=pr);
		
		if(left < pr) quickSort(a, left, pr);
		if(right > pl) quickSort(a, pl, right);
	}
	
	private static void quickSort2(int[] a, int left, int right) {
		Stack<Integer> stkLeft = new Stack<>();
		Stack<Integer> stkRight = new Stack<>();
		
		stkLeft.push(left);
		stkRight.push(right);
		
		while(!stkLeft.isEmpty()) {
			int pl = left = stkLeft.pop();
			int pr = right = stkRight.pop();

			int x = a[(pl + pr)/2];
			
			do {
				while(a[pl]<x) pl++;
				while(a[pr]>x) pr--;
				if(pl<=pr) {
					swap(a, pl++, pr--);
				}
			} while(pl<=pr);
			
			if(left < pr) {
				stkLeft.push(left);
				stkRight.push(pr);
			}
			if(pl < right) {
				stkLeft.push(pl);
				stkRight.push(right);
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,6,2,4,3,5,3,4,5};
		
		quickSort2(a, 0, a.length-1);
		
		for(int i : a) {
			System.out.println(i);
		}
		
	}

}
