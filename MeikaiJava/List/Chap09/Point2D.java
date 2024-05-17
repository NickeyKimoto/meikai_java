package MeikaiJava.List.Chap09;

//--- 2次元座標クラス ---//

public class Point2D {
	
	public int x = 0;  // x座標
	public int y = 0;  // y座標
	
	// 多重定義されたコンストラクタ
	public Point2D() {}
	public Point2D(int x, int y) { set(x, y); }
	public Point2D(Point2D p)    { this(p.x, p.y); } // コピーコンストラクタ
	
	// ゲッタ
	public int getX() { return x; }
	public int getY() { return y; }
	
	// セッタ
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public void set(int x,int y) { setX(x);  setY(y); }
	
	// インスタンスの状態を簡潔に表現した文字列を返却
	public String toString() { return "(" + x + "," + y + ")"; }
	

}
