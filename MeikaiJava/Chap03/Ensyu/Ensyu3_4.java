package MeikaiJava.Chap03.Ensyu;

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class Ensyu3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
							
		// 整数aの入力を促し読み込む
			System.out.print("整数a："); int a = stdIn.nextInt();
		// 整数bの入力を促し読み込む
			System.out.print("整数b："); int b = stdIn.nextInt();
					
		// もしもa > bなら文章を表示
			if (a > b)
				System.out.println("aのほうが大きいです。");
		// もしもa > bなら文章を表示
			else if (a < b)
				System.out.println("bのほうが大きいです。");
			
		// もしもa == bなら文章を表示
			else if (a == b)
				System.out.println("aとbは同じ値です。");

		
	}

}
