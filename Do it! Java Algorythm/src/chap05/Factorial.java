package chap05;

import java.util.Stack;

public class Factorial {
	private static int Factorial(int x) {
		if(x>0) {
			return x * Factorial(x-1);
		}
		else {
			return 1;
		}
	}
	
	private static int Factorial2(int x) {
		Stack<Integer> stk = new Stack<>();
		int fac = 1;
		while(true) {
			if(x>0) {
				stk.push(x);
				x = x-1;
				continue;
			}
			if(!stk.isEmpty()) {
				fac *= stk.pop();
				continue;
			}
			break;
		}
		return fac;
	}

	public static void main(String[] args) {
		System.out.println(Factorial(6));
		System.out.println(Factorial2(6));
	}

}
