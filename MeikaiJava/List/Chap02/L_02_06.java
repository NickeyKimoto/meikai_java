package MeikaiJava.List.Chap02;

//二つの変数xとyの合計と平均を表示

public class L_02_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int x; // xはint型の変数
		int y; // yはint型の変数
		
		x = 63; // xに63を代入
		y = 18; // yに18を代入
				
		// xの値を表示
		System.out.println("xの値は" + x + "です。");
		// yの値を表示
		System.out.println("yの値は" + y + "です。");
		// 合計を表示
		System.out.println("合計は" + (x + y) + "です。");
		// 平均を表示
		System.out.println("平均は" + (x + y) / 2 + "です。");

	}

}
