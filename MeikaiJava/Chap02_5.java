package MeikaiJava;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Chap02_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
				
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
				
		// xの値の入力を促す
		System.out.print("xの値：");
		// xに実数値を読み込む
		double x = stdIn.nextDouble();
				
		// yの値の入力を促す
		System.out.print("yの値：");
		// yに実数値を読み込む
		double y = stdIn.nextDouble();
				
		// 入力された値の合計を表示
		System.out.println("合計は" + (x + y) + "です。");
				
		// 入力された値の平均を表示
		System.out.println("平均は" + (x + y) / 2 + "です。");

	}

}
