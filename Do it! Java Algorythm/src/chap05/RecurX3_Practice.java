package chap05;

import java.util.Stack;

public class RecurX3_Practice {
	private static void recur3(int n) {
		if(n>0) {
			recur3(n-1);
			recur3(n-2);
			System.out.println(n);
		}
	}
	
	private static void recurX3(int n) {
		Stack<Integer> stk = new Stack<>();
		stk.push(-1);
		
		while(true) {
			if(n>0) {
				stk.push(n);
				n = n-1;
				continue;
			}
			if(!stk.isEmpty()) {
				n = stk.pop();
				if(n==-1) {
					break;
				}
				if(stk.peek() == n) {
					System.out.println(n);
					stk.pop();
					n = -1;
					continue;
				}
				if(n-2 > 0) {
					stk.push(n);
					stk.push(n);
					n = n-2;
					continue;
				}
				else {
					System.out.println(n);
					n = -1;
					continue;
				}
			}
			break;
		}
	}

	public static void main(String[] args) {
		recur3(4);
		recurX3(4);
	}

}
