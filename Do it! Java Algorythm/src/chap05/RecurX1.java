package chap05;

public class RecurX1 {
	private static void recur(int n) {
		
//		if(n>0) {
//			recur(n-1);
//			System.out.println(n);
//			recur(n-2);
//		}
		
		while(n>0) {
			recur(n-1);
			System.out.println(n);
			n = n-2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
