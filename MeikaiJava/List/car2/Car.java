package MeikaiJava.List.car2;

public class Car {
	
	// 名前を表すインスタンス変数を宣言(教本準拠の変数)
	private String name;
	// 車幅を表すインスタンス変数を宣言(教本準拠の変数)
	private int width;
	// 車高を表すインスタンス変数を宣言(教本準拠の変数)
	private int height;
	// 車長を表すインスタンス変数を宣言(教本準拠の変数)
	private int length;
	// 現在位置X座標を表すインスタンス変数を宣言(教本準拠の変数)
	private double x;
	// 現在位置Y座標を表すインスタンス変数を宣言(教本準拠の変数)
	private double y;
	// 残り燃料を表すインスタンス変数を宣言(教本準拠の変数)
	private double fuel;
	// 購入日を表すインスタンス変数を宣言
	private Day purchaseDay;

	//--- コンストラクタ ---//
	Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		
		// 名前を表すインスタンス変数を初期化
		this.name = name;
		// 車幅を表すインスタンス変数を初期化
		this.width = width;
		// 車高を表すインスタンス変数を初期化
		this.height = height;
		// 車長を表すインスタンス変数を初期化
		this.length = length;
		// 残り燃料を表すインスタンス変数を初期化
		this.fuel = fuel;
		// 現在位置X,Y座標を表すインスタンス変数を初期化
		x = y = 0.0;
		// 購入日を表すインスタンス変数を初期化
		this.purchaseDay = new Day(purchaseDay);
		
	}
	
	double getX() {
		
		// 現在位置のX座標を返却
		return x;
		
	}
	
	double getY() {
		
		// 現在位置のY座標を返却
		return y;
		
	}
	
	double getFuel() {
		
		// 現在の残り燃料を返却
		return fuel;
		
	}
	
	public Day getPurchaseDay() {
		
		// 購入日を返却
		return new Day(purchaseDay);
		
	}
	
	//--- スペック表示 ---//
	void putSpec() {
		
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
		
	}
	
	//--- X方向にdx・Y方向にdy移動 ---//
	boolean move(double dx, double dy) {
		
		double dist = Math.sqrt(dx * dx + dy * dy); // 移動距離
		
		if (dist > fuel) {
			
			return false; // 移動できない…燃料不足
			
		} else {
			
			fuel -= dist; // 移動距離の分だけ燃料が減る
			x += dx;
			y += dy;
			
			return true; // 移動完了
			
		}
		
	}
	
}
