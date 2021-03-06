package chap05;

import java.util.Stack;

public class RecurX3 {
	private static void recur3(int n) {
		if(n>0) {
			recur3(n-1);
			recur3(n-2);
			System.out.println(n);
		}
	}
	
	private static void recurX3(int n) {
		Stack<Integer> stk = new Stack<>();
		int copyN;
		stk.push(0);
		
		while(true) {
			if(n>0) {
				stk.push(n);
				n = n-1;
				continue;
			}
			
			if(!stk.isEmpty()) {
				n = stk.pop();
				copyN = n;
				if(n == 0) {
					break;
				}
				if(n-2>0) {
					if(stk.peek() == copyN) {
						System.out.println(stk.pop());
						n = -1;
						continue;
					}
					else {
						stk.push(n);
						stk.push(n);
						n = n-2;
						continue;
					}
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
		recurX3(4);
	}

}
