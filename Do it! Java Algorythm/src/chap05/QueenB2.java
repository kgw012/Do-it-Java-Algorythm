package chap05;

public class QueenB2 {
	private static int[] pos = new int[8];
	private static boolean[] flag_a = new boolean[8];    // -ÀÚ
	private static boolean[] flag_b = new boolean[15];   // /ÀÚ
	private static boolean[] flag_c = new boolean[15];   // \ÀÚ
	
	private static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf(" %d", pos[i]);
		}
		System.out.println();
	}
	
	private static void set(int i) {
		for(int j=0; j<8; j++) {
			if(flag_a[j] == false && flag_b[i+j] == false && flag_c[i-j+7] == false) {
				pos[i] = j;
				if(i >= 7) {
					print();
				}
				else {
					flag_a[j] = true;
					flag_b[i+j] = true;
					flag_c[i-j+7] = true;
					set(i+1);
					flag_a[j] = false;
					flag_b[i+j] = false;
					flag_c[i-j+7] = false;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		set(0);
	}

}
