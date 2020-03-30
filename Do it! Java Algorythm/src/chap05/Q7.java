package chap05;

import java.util.Stack;

public class Q7 {

	private static void move(int no, char x, char y) {
		
		int sum = 'A'+'B'+'C';
		int z = sum-x-y;
		
		if(no>1) {
			move(no-1, x, (char)z);
		}
		
		System.out.println(no + "번 원반을 기둥 '" + x + "'에서 기둥 '" + y + "'으로 옮겼습니다.");
		
		if(no>1) {
			move(no-1, (char)z, y);
		}
	}
	
	private static void moveX(int no, char x, char y) {
		int sum = 'A' + 'B' + 'C';
		char z = (char)(sum - (x + y));
		
		Stack<Integer> stkNO = new Stack<>();
		Stack<Character> stkX = new Stack<>();
		Stack<Character> stkY = new Stack<>();
		Stack<Character> stkZ = new Stack<>();
		
		while(true) {
			if(no>0) {
				stkNO.push(no);
				no = no-1;
				stkX.push(x);
				stkY.push(y);
				stkZ.push(z);
				y = z;
				z = (char)(sum-x-y);
				continue;
			}
			if(!stkNO.isEmpty()) {
				no = stkNO.pop();
				x = stkX.pop();
				y = stkY.pop();
				z = stkZ.pop();
				System.out.println(no + "번 원반을 기둥 '" + x + "'에서 기둥 '" + y + "'으로 옮겼습니다.");
				no = no-1;
				x = z;
				z = (char)(sum-x-y);
				continue;
			}
			break;
		}
	}

	public static void main(String[] args) {
		moveX(4, 'A', 'C');
	}
}