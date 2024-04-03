package MeikaiJava;

// ランダム関数を利用できるようにする
import java.util.Random;

public class Chap02_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ランダムクラスのインスタンスを生成
		Random rand = new Random();
		
		// 0から9の正の整数値をランダムに生成
		int x = rand.nextInt(10);
		// 0から90の正の整数値をランダムに生成
		int y = rand.nextInt(90);
		
		// 1桁の正の整数値をランダムに生成して表示
		System.out.println( x );
		// 1桁の負の整数値をランダムに生成して表示
		System.out.println( -x );
		// 10桁の正の整数値をランダムに生成して表示
		System.out.println(10 + y);

	}

}
