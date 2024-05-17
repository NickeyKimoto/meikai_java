package MeikaiJava.List.Chap08;

//--- 会員クラスのテストプログラム ---//
public class MemberTester {

	public static void main(String[] args) {

		// クラス型変数、コンストラクタの呼び出し
		Member suzuki = new Member("鈴木", 1357, 25);
		
		// インスタンスメソッドの呼び出し
		suzuki.print(); // 鈴木を表示

	}

}
