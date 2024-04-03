package MeikaiJava;

//ランダム関数を利用できるようにする
import java.util.Random;

public class Chap02_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ランダムクラスのインスタンスを生成
		    Random rand = new Random();
				
		// 0から1.0未満の実数値をランダムに生成
			double x = rand.nextDouble(1.0);
		// 0から10.0未満の実数値をランダムに生成
			double y = rand.nextDouble(10.0);
		// 0から2.0未満の実数値をランダムに生成
			double z = rand.nextDouble(2.0);
				
		// 0.0以上1.0未満の実数値をランダムに生成して表示
			System.out.println( x );
		// 0.0以上10.0未満の実数値をランダムに生成して表示
			System.out.println( y );
		// -1.0以上1.0未満の実数値をランダムに生成して表示
			System.out.println(z - 1.0);

	}

}
