package MeikaiJava.List.day4;

// 日付クラスDay【第4版】利用例

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class DayTester {

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		int y, m, d;
		
		System.out.print("西暦年：");
		y = standardInput.nextInt();
		// クラスメソッド(静的メソッド)の呼び出し
		System.out.println("その年は閏年" + (Day.isLeap(y) ? "です。" : "ではありません。"));
		
		System.out.println("日付を入力せよ。");
		System.out.print("年：");  y = standardInput.nextInt();
		System.out.print("月：");  m = standardInput.nextInt();
		System.out.print("日：");  d = standardInput.nextInt();
		
		Day a = new Day(y, m, d);
		
		// インスタンスメソッドの呼び出し
		System.out.println(a.getYear() + "年は閏年" + (a.isLeap() ? "です。" : "ではありません。"));

	}

}
