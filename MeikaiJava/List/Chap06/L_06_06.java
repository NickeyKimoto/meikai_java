package MeikaiJava.List.Chap06;

// 配列の各要素を1,2,3,4,5で初期化して表示

public class L_06_06 {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("a[" + i + "] = " + a[i]);
			
		}

	}

}
