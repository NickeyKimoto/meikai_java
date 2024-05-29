package MeikaiJava.List.Chap15;
//String.formatメソッドによる書式文字列の作成
public class L_15_09 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.printf(String.format("%%%dd\n", i), 5);
		}

	}

}
