package MeikaiJava.Chap02List;

// 二つの整数値を読み込んで加減乗除した値を表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class List2_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
			
		// 「xとyを加減乗除します。」と表示
			System.out.println("xとyを加減乗除します。");
			
		// xの値の入力を促す
		    System.out.print("xの値：");
		// xに実数値を読み込む
		    int x = stdIn.nextInt();
					
		// yの値の入力を促す
		    System.out.print("yの値：");
		// yに実数値を読み込む
		    int y = stdIn.nextInt();
		    
		// x + yの値を表示
		    System.out.println("x + y = " + (x + y));
		 // x - yの値を表示
		    System.out.println("x - y = " + (x - y));
		 // x * yの値を表示
		    System.out.println("x * y = " + (x * y));
		 // x / yの値を表示
		    System.out.println("x / y = " + (x / y));
		 // x % yの値を表示
		    System.out.println("x % y = " + (x % y));
			

	}

}
