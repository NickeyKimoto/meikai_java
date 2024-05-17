package MeikaiJava.List.day1;

// 日付クラスDay【第1版】

public class Day {
	
	private int year;  // 年
	private int month; // 月
	private int date;  // 日

	// コンストラクタ
	Day(int year, int month, int date) {
		
		this.year = year;   // 年
		this.month = month; // 月
		this.date = date;   // 日
		
	}
	
	//--- 年・月・日を取得 ---//
	// ゲッタ
	int getYear() { return year;}   // 年を取得
	int getMonth() { return month;} // 月を取得
	int getDate() { return date;}   // 日を取得
	
	//--- 年・月・日を設定 ---//
	// セッタ
	void setYear(int year) { this.year = year;}     // 年を設定
	void setMonth(int month) { this.month = month;} // 月を設定
	void setDate(int date) { this.date = date;}     // 月を設定
	
	void set(int year, int month, int date) { // 年月日を設定
		
		this.year = year;   // 年
		this.month = month; // 月
		this.date = date;   // 日
		
	}
	
	//--- 曜日を求める ---//
	int day0fWeek() {
		
		int y = year;           // 0 … 日曜日
		int m = month;          // 1 … 月曜日
		                        //   ：
		if (m == 1 || m == 2) { // 5 … 金曜日
			                    // 6 … 土曜日
			y--;
			m += 12;
			
		}
		
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
		
	}
	
	
}
