package MeikaiJava.List.Chap13.shape1;

// // 図形クラス群【第1版】の利用例

public class ShapeTester {

	public static void main(String[] args) {

		// 抽象クラスはインスタンス化できない
//		Shape s = new Shape();
		
		Shape[] a = new Shape[2];
		a[0] = new Point();         // 点
		a[1] = new Rectangle(4, 3); // 長方形
		
		for (Shape s : a) {
			
			s.draw(); // 描画
			System.out.println();
			
		}
		
// 別解
//		for (int i = 0; i < a.length; i++) {
//			
//			a[i].draw();
//			System.out.println();
//			
//		}

	}

}
