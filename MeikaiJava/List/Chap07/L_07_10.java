package MeikaiJava.List.Chap07;

// 識別子の有効範囲を確認する

public class L_07_10 {
	
	static int x = 700; // クラス有効範囲：フィールド
	
	static void printX() {
		
		System.out.println("x = " + x);
		
	}

	public static void main(String[] args) {

		System.out.println("x = " + x); // 1
		
		int x = 800; // ブロック有効範囲：局所変数
		
		System.out.println("x = " + x); // 2
		
		System.out.println("L_07_10.x = " + L_07_10.x); // 3
		
		printX(); // 4

	}

}
