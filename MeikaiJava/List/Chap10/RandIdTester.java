package MeikaiJava.List.Chap10;

// 識別番号クラス(その2：開始番号を乱数で決定)

// ランダム関数を利用できるようにする
import java.util.Random;

class RandId {
	
	private static int counter; // 何番までの識別番号を与えたか
	
	private int id; // 識別番号
	
	// 静的初期化子
	static {
		
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();
		counter = randomVariable.nextInt(10) * 100;
		
	}
	
	//-- コンストラクタ --//
	public RandId() {
		
		id = ++counter; // 識別番号
		
	}
	
	//--- 識別番号を取得 ---//
	public int getId() {
		
		return id;
		
	}
	
}

public class RandIdTester {

	public static void main(String[] args) {

		RandId a = new RandId();
		RandId b = new RandId();
		RandId c = new RandId();
		
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("cの識別番号：" + c.getId());

	}

}
