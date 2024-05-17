package MeikaiJava.List.Chap04;

// 式の評価順が左→右であることを確認

public class L_04_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int a = 3;
		int x = (a++) * (2 + a);
		
		System.out.println("a = " + a);
		System.out.println("x = " + x);

	}

}
