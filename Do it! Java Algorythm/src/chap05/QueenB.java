package chap05;

public class QueenB {
	private static int[] pos = new int[8];
	
	private static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf(" %d", pos[i]);
		}
		System.out.println();
	}
	
	private static void set(int i) {
		for(int j=0; j<8; j++) {
			pos[i] = j;
			if(i >= 7) {
				print();
			}
			else {
				set(i+1);
			}
		}
	}
	

	public static void main(String[] args) {
		set(0);
	}

}
