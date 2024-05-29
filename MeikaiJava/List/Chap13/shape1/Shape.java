package MeikaiJava.List.Chap13.shape1;

// 図形クラス群【第1版】

//===== 図形 =====// // 抽象クラス
abstract class Shape {
	
	abstract void draw(); // 描画(抽象メソッド)

}

//===== 点 =====//
class Point extends Shape {
	
	Point() { } // コンストラクタ
	
	void draw() { // 描画
		
		System.out.println('+');
		
	}

}

//===== 長方形 =====//
class Rectangle extends Shape {
	
	private int width; // 幅
	private int height; // 高さ
	
	Rectangle(int width, int height) { // コンストラクタ
		
		this.width = width;
		this.height = height;
		
	}
	
	void draw() { // 描画
		
		for (int i = 1; i <= height; i++) {
			
			for (int j = 1; j <= width; j++) {
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
