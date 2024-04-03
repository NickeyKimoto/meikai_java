
// 0～9のラッキーナンバーを乱数で生成して表示

// ランダム関数を利用できるようにする
import java.util.Random;

public class List2_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ランダムクラスのインスタンスを生成
			Random rand = new Random();
			
		// 0から9の整数値をランダムに生成
			int lucky = rand.nextInt(10);
			
		// ラッキーナンバーを乱数で生成して表示
			System.out.println("今日のラッキーナンバーは" + lucky + "です。");

	}

}
