package chap05;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		for(int i=0; i<10; i++) {
			stk.push(i);
		}
		
		Stack<Integer> stk2 = new Stack<>();
		for(int i=0; i<stk.size(); i++) {
			stk2.push(stk.get(i));
		}
		
		while(!stk2.isEmpty()) {
			System.out.println(stk2.pop());
		}
	}

}
