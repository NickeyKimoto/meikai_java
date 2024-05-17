package MeikaiJava.List.day1;

// 日付クラスDay【第1版】利用例(その2：クラス型変数の代入)

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class DayAssign {

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		
		System.out.println("誕生日を西暦で入力せよ。");
		System.out.print("年："); int y = standardInput.nextInt();
		System.out.print("月："); int m = standardInput.nextInt();
		System.out.print("日："); int d = standardInput.nextInt();
		
		Day birthday = new Day(y, m, d);
		
		System.out.println("あなたの誕生日" + birthday.getYear() + "年" + birthday.getMonth() 
		+ "月" + birthday.getDate() + "日は" + wd[birthday.day0fWeek()] + "曜日です。");
		
		Day xDay = birthday;
		
		xDay.set(2100, 12, 31); // 2100年12月31日に設定;
		
		System.out.println("birthday = " + birthday.getYear() + "年" + birthday.getMonth() 
		+ "月" + birthday.getDate() + "日(" + wd[birthday.day0fWeek()] + ")");
		
		System.out.println("xDay     = " + xDay.getYear() + "年" + xDay.getMonth() 
		+ "月" + xDay.getDate() + "日(" + wd[xDay.day0fWeek()] + ")");

	}

}
