package MeikaiJava.List.Chap15;
// コマンドライン引数と文字列の配列を表示する
public class L_15_Last2 {
	
	static void printStringArray(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println("No." + i + " = " + s[i]);
		}
	}

	public static void main(String[] args) {
		String hands[] = {
				"グー", "チョキ", "パー"
		};
		
		System.out.println("コマンドライン引数");
		printStringArray(args);
		
		System.out.println("ジャンケンの手");
		printStringArray(hands);

	}

}
