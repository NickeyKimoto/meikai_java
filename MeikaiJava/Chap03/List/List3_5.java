package MeikaiJava.Chap03.List;

//読み込んだ整数値の符号（正／負／０）を判定して表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class List3_5 {

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
				System.out.print("その値は正です。");
		// 整数値がn < 0なら表示
			else if (n < 0)
			    System.out.print("その値は負です。");
		// 整数値がn = 0なら表示
			else
			    System.out.print("その値は０です。");

	}

}
