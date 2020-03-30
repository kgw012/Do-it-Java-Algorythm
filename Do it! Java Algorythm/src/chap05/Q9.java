package chap05;

import java.util.Stack;

public class Q9 {
	private static int[] pos = new int[8];
	private static boolean[] flag_a = new boolean[8];
	private static boolean[] flag_b = new boolean[15];
	private static boolean[] flag_c = new boolean[15];
	private static int count1 = 0;

	private static void print() {
		for(int i=0; i<8; i++) {
			for(int j=0; j<pos[i]; j++) {
				System.out.print('бр' + " ");
			}
			System.out.print('бс' + " ");
			for(int j=pos[i]+1; j<8; j++) {
				System.out.print('бр' + " ");
			}
			System.out.println();
		}
	}
	

	private static void set(int i) {
		for(int j=0; j<8; j++) {
			if(flag_a[j] == false && flag_b[i+j] == false && flag_c[i-j+7] == false) {
				pos[i] = j;
				if(i>=7) {
					print();
					System.out.println("----------------");
					count1++;
				}
				else {
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
					set(i+1);
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
				}
			}
		}
	}
	
	private static void setX() {
		Stack<Integer> stkI = new Stack<>();
		Stack<Integer> stkJ = new Stack<>();
		
		int count2 = 0;
		
		loop:
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(flag_a[j] == false && flag_b[i+j] == false && flag_c[i-j+7] == false) {
					pos[i] = j;
					if(i>=7) {
						print();
						System.out.println("----------------");
						count2++;
						while(j>=7) {
							if(stkI.isEmpty()) break loop;
							i = stkI.pop();
							j = stkJ.pop();
							flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
							pos[i] = 0;
						}
						continue;
					}
					else {
						flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
						stkI.push(i);
						stkJ.push(j);
						continue loop;
					}
				}
				else if(j>=7) {
					while(j>=7) {
						if(stkI.isEmpty()) break loop;
						i = stkI.pop();
						j = stkJ.pop();
						flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
						pos[i] = 0;
					}
				}
			}
		}
		System.out.println(count2);
	}
	public static void main(String[] args) {
//		set(0);
//		System.out.println(count1);
		
		setX();
	}

}
