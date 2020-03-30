package chap05;

public class Q6 {

	private static void move(int no, char x, char y) {
		if('A' > x || 'C' < x || 'A' > y || 'C' < x) {
			System.out.println("기둥을 A, B, C 중에 입력해주세요.");
		}
		
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
	
	public static void main(String[] args) {
		move(3, 'A', 'C');
	}

}