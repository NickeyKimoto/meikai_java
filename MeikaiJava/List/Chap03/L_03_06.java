package MeikaiJava.List.Chap03;

//読み込んだ整数値が正であれば偶数／奇数を判定して表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class L_03_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
							
		// 整数値の入力を促す
			System.out.print("整数値：");
		// 整数値を読み込む
			int n = stdIn.nextInt();
							
		// 整数値がn > 0なら表示
			if (n > 0)
				// 偶数なら表示
				if (n % 2 == 0)
				    System.out.print("その値は偶数です。");
				// 奇数がなら表示
				else
					System.out.print("その値は奇数です。");
			
		// 整数値がn > 0でないなら表示
					else
					    System.out.print("正でない値が入力されました。");
	}

}
