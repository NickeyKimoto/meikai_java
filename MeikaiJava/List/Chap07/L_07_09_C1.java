package MeikaiJava.List.Chap07;

// final仮引数に値を代入できないことを確認

public class L_07_09_C1 {
	
	//--- 三つの仮引数の値の和を求める ---//
	static int sum0f(final int x, final int y, final int z) {
		
		// x = 10;
		return x + y + z;
		
	}

	public static void main(String[] args) {

		System.out.println(sum0f(1, 2, 3));

	}

}
