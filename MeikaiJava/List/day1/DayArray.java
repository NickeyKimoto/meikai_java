package MeikaiJava.List.day1;

// 日付クラスDay【第1版】の配列(その2)

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class DayArray {

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		
		System.out.print("日付は何個：");
		int n = standardInput.nextInt();
		
		Day[] a = new Day[n]; // 要素数n個のDay型配列
		
		for(int i = 0; i < a.length; i++) {
			
			// その1からここを変更
			a[i] = new Day(2017, 10, 15); // 全要素を2017年10月15日に設定
			
		}
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.println("a[" + i + "] = " + a[i].getYear() + "年" + a[i].getMonth() + 
					"月" + a[i].getDate() + "日(" + wd[a[i].day0fWeek()] + ")");
			
		}

	}

}
