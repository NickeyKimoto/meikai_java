package MeikaiJava.List.Chap07;

// 長方形と正方形を表示

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_09 {

	//--- 文字cをn個連続表示 ---//
	static void putChars(char c, int n) {

		while (n-- > 0) {

			System.out.print(c);

		}

	}

	//--- 文字'+'を並べて一辺の長さnの正方形を表示 ---//
	static void putSquare(int n) {

		for (int i = 1; i <= n; i++) { // 以下の処理をn回行う

			putChars('+', n); // ・文字'+'をn個表示
			System.out.println(); // ・改行

		}

	}

	//--- 文字'*'を並べて高さhで幅wの長方形を表示 ---//
	static void putRectangle(int h, int w) {

		for (int i = 1; i <= h; i++) { // 以下の処理をh回行う

			putChars('*', w); // ・文字'*'をw個表示
			System.out.println(); // ・改行

		}

	}

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		System.out.println("正方形を表示します。");
		// 整数の入力を促す()
		System.out.print("一辺は：");
		// 入力された値を読み込む
		int n = standardInput.nextInt();
		// 正方形を表示
		putSquare(n);

		System.out.println("長方形を表示します。");
		// 整数の入力を促す()
		System.out.print("高さは：");
		// 入力された値を読み込む
		int h = standardInput.nextInt();
		// 整数の入力を促す()
		System.out.print("横幅は：");
		// 入力された値を読み込む
		int w = standardInput.nextInt();
		// 長方形を表示
		putRectangle(h, w);

	}

}
