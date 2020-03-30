package chap05;

import java.util.Stack;

public class RecurX2 {
	private static void recur(int n) {
//		if(n>0) {
//			recur(n-1);
//			System.out.println(n);
//			recur(n-2);
//		}
		
		Stack<Integer> s = new Stack<>();
		
		while(true) {
			if(n>0) {
				s.push(n);
				n = n-1;
				continue;
			}
			if(!s.isEmpty()) {
				n = s.pop();
				System.out.println(n);
				n = n-2;
				continue;
			}
			break;
		}
		
	}
	public static void main(String[] args) {
		recur(4);
	}

}