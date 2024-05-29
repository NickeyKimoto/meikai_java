package MeikaiJava.List.Chap15;
// 文字列のインターン
public class L_15C_2 {

	public static void main(String[] args) {
		String s = "DEF";
		String s1 = "ABC" + s;
		String s2 = "ABC" + s;
		
		System.out.println("s1：" + s1);
		System.out.println("s2：" + s2);
		
		// 参照先の比較
		if (s1 == s2)
			// 実行されない
			System.out.println("s1 == s2です。");
		else
			// 必ず実行される
			System.out.println("s1 != s2です。");
		
		s1 = s1.intern();
		s2 = s2.intern();
		
		if (s1 == s2)
			// 必ず実行される
			System.out.println("s1 == s2です。");
		else
			// 実行されない
			System.out.println("s1 != s2です。");
	}

}
