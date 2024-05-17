package MeikaiJava.List.Chap07;

// 右下が直角の三角形を表示

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_08 {

	//--- 文字cをn個連続表示 ---//
	static void putChars(char c, int n) {

		while (n-- > 0) {

			System.out.print(c);

		}

	}

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		System.out.println("右下直角の三角形を表示します。");
		// 整数の入力を促す()
		System.out.print("段数は：");
		// 入力された値を読み込む
		int n = standardInput.nextInt();

		for (int i = 1; i <= n; i++) {

			putChars(' ', n - i); // ' 'をn-i個表示
			putChars('+', i); // '+'をi個表示
			System.out.println();

		}

	}

}
