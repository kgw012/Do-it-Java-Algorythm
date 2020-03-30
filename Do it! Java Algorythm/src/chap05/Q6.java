package chap05;

public class Q6 {

	private static void move(int no, char x, char y) {
		if('A' > x || 'C' < x || 'A' > y || 'C' < x) {
			System.out.println("����� A, B, C �߿� �Է����ּ���.");
		}
		
		int sum = 'A'+'B'+'C';
		int z = sum-x-y;
		
		if(no>1) {
			move(no-1, x, (char)z);
		}
		
		System.out.println(no + "�� ������ ��� '" + x + "'���� ��� '" + y + "'���� �Ű���ϴ�.");
		
		if(no>1) {
			move(no-1, (char)z, y);
		}
	}
	
	public static void main(String[] args) {
		move(3, 'A', 'C');
	}

}