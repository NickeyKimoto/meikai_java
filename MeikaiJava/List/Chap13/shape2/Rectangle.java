package MeikaiJava.List.Chap13.shape2;

/*
 * クラスRectangleは、長方形を表すクラスです。
 * このクラスは、図形を表す抽象クラスShapeから派生したクラスです。
 * @author 柴田望洋
 * @see    Shape
 */

public class Rectangle extends Shape {
	
	/*
	 * 長方形の幅を表すint型のフィールドです。
	 */
	
	private int width;
	
	/*
	 * 長方形の高さを表すint型のフィールドです。
	 */
	
	private int heigth;
	
	/*
	 * 長方形を生成するコンストラクタです。
	 * 幅と高さを引数として受け取ります。
	 * @param width 長方形の幅。
	 * @param heigth 長方形の長さ。
	 */
	
	public Rectangle(int width, int heigth) {
		
		this.width = width;
		this.heigth = heigth;
		
	}
	
	/*
	 * メソッドtoStringは、長方形に関する図形情報を表す文字列を返却します。
	 * @return 文字列"Rectangle(width:4, heigth:3)"を返却します。
	 * 4と3の部分は、それぞれ幅と高さに応じた値です。
	 */
	
	public String toString() {
		
		return "Rectangle(width:" + width + ", heigth:" + heigth + ")";
		
	}
	
	/*
	 * メソッドdrawは、長方形を描画します。
	 * 描画は、アステリスク記号'*'を並べることによって行います。
	 * 幅の個数だけ'*'を連続表示して改行するのをwidth回だけ繰り返します。
	 */
	
	public void draw() {
		
		for (int i = 1; i <= heigth; i++) {
			
			for (int j = 1; j <= width; j++) {
			
				System.out.print('*');
			
			}
			
			System.out.println();
			
		}
		
	}

}
