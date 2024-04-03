package MeikaiJava;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Chap02_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
		
		// プログラムの内容を表示
		System.out.println("三角形の面積を求めます。");
		
		// 底辺の値の入力を促す
		System.out.print("底辺：");
		// xに実数値を読み込む
		double x = stdIn.nextDouble();
		
		// 高さの値の入力を促す
		System.out.print("高さ：");
		// yに実数値を読み込む
		double y = stdIn.nextDouble();
		
		
		// 入力された値の三角形の面積を表示
		System.out.println("面積は" + x * y / 2 + "です。");

	}

}
