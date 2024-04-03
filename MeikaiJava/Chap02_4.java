package MeikaiJava;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Chap02_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
		
		// 整数値と表示
		System.out.print("整数値");
		// aに数値を読み込む
		int a = stdIn.nextInt();
		
		// 入力された値に10を加えた値を表示
		System.out.println("10を加えた値は" + (a + 10) + "です。");
		
		// 入力された値に10を減じた値を表示
		System.out.println("10を減じた値は" + (a - 10) + "です。");

	}

}
