package MeikaiJava.List.car2;

// 自動車クラス【第2版】の利用例(その2)

public class CarTester2 {

	public static void main(String[] args) {
		
		Car myCar = new Car("愛車", 1885, 1490, 5220, 90.0, new Day(2000, 11, 18));
		
		myCar.putSpec();
		System.out.println("愛車の購入日：" + myCar.getPurchaseDay().toString());

	}

}
