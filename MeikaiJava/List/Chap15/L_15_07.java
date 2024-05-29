package MeikaiJava.List.Chap15;
// 文字列の比較

import java.util.Scanner;

public class L_15_07 {

	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 探索する文字列の入力を促す
		System.out.print("文字列s1：");
		// 入力された値を読み込む(教本準拠の変数名)
		String s1 = standardInput.next();
		
		// 探索する対象となる文字列の入力を促す
		System.out.print("文字列s2：");
		// 入力された値を読み込む(教本準拠の変数名)
		String s2 = standardInput.next();
		
		// 参照先の比較
		if (s1 == s2)
			// 実行されない
			System.out.println("s1 == s2です。");
		else
			// 必ず実行される
			System.out.println("s1 != s2です。");
		
		// 文字列の比較
		if (s1.equals(s2))
			System.out.println("s1とs2の中身は等しい。");
		else
			System.out.println("s1とs2の中身は等しくない。");

	}

}
