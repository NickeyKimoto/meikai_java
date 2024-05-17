package MeikaiJava.List.Chap03;

//読み込んだ二つの整数値の小さいほうの値を表示（その１：if分）

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_03_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
					Scanner stdIn = new Scanner(System.in);
													
				// 整数aの入力を促し、読み込む
					System.out.print("整数a："); int a = stdIn.nextInt();
				// 整数bの入力を促し、読み込む
				    System.out.print("整数b："); int b = stdIn.nextInt();
				    
				// 小さいほうの値に初期化
				    int min;
				// aのほうが小さい場合
				    if (a < b)
				    	min = a;
				    
				// bのほうが小さい場合
				    else
				    	min = b;
				    
				// 小さいほうの値を表示
				    System.out.print("小さいほうの値は" + min + "です。");
					

	}

}
