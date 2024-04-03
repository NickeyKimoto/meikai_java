package MeikaiJava.Chap03.Ensyu;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Ensyu3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
				Scanner stdIn = new Scanner(System.in);
												
			// 整数aの入力を促し、読み込む
				System.out.print("整数a："); int a = stdIn.nextInt();
			// 整数bの入力を促し、読み込む
			    System.out.print("整数b："); int b = stdIn.nextInt();
			    
			// 大きいほうの値に初期化
			    int max = a > b ? a : b;
			 
			 // 大きいほうの値を表示
			    System.out.print("大きいほうの値は" + max + "です。");

	}

}
