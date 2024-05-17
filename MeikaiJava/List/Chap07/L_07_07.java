package MeikaiJava.List.Chap07;

// 左下が直角の三角形を表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_07 {

	//--- 文字'*'をn個連続表示 ---//
	static void putStars(int n) {

		while (n-- > 0) {

			System.out.print('*');

		}

	}

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		System.out.println("左下直角の三角形を表示します。");
		// 整数の入力を促す()
		System.out.print("段数は：");
		// 入力された値を読み込む
		int n = standardInput.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			putStars(i);
			System.out.println();
			
		}

	}

}
