package MeikaiJava.List.car2;

// 自動車クラス【第2版】の利用例(その1)

public class CarTester1 {

	public static void main(String[] args) {

		Day d = new Day(2010, 10, 15);
		Car myCar = new Car("愛車", 1885, 1490, 5220, 90.0, d);
		
		Day p = myCar.getPurchaseDay();
		System.out.println("愛車の購入日：" + p);
		
		p.set(1999, 12, 31); // 購入日を書き換える(?)
		
		Day q = myCar.getPurchaseDay();
		System.out.println("愛車の購入日：" + q);

	}

}
