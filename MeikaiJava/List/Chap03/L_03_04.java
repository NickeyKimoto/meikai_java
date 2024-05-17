package MeikaiJava.List.Chap03;

	//読み込んだ整数値はゼロであるかどうか
	
	//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
		import java.util.Scanner;

public class L_03_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
			
		// 整数値の入力を促す
			System.out.print("整数値：");
		// 整数値を読み込む
			int n = stdIn.nextInt();
			
		// 整数値が0なら表示
			if (!(n != 0))
				System.out.print("その値はゼロです。");
		// 整数値が0でなければ表示
			else
				System.out.print("その値はゼロではありません。");

	}

}
