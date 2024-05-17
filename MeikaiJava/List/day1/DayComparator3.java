package MeikaiJava.List.day1;

// 日付クラスDay【第1版】利用例(その5：二つの日付を比較③)

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class DayComparator3 {
	
	//--- d1とd2の日付は等しいか？ ---//
	static boolean compDay(Day d1, Day d2) {
		
		return d1.getYear() == d2.getYear() && d1.getMonth() ==
				d2.getMonth() && d1.getDate() == d2.getDate();
		
	}

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		int y, m, d;
		
		System.out.println("日付1を入力せよ。");
		System.out.print("年："); y = standardInput.nextInt();
		System.out.print("月："); m = standardInput.nextInt();
		System.out.print("日："); d = standardInput.nextInt();
		
		Day day1 = new Day(y, m, d);
		
		System.out.println("日付2を入力せよ。");
		System.out.print("年："); y = standardInput.nextInt();
		System.out.print("月："); m = standardInput.nextInt();
		System.out.print("日："); d = standardInput.nextInt();
		
		Day day2 = new Day(y, m, d);
		
		if (compDay(day1, day2)) {
			
			System.out.println("等しいです。");
			
		} else {
			
			System.out.println("等しくありません。");
			
		}

	}

}
