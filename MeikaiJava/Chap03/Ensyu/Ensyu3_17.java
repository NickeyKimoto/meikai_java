package MeikaiJava.Chap03.Ensyu;

//ランダム関数を利用できるようにする
import java.util.Random;

public class Ensyu3_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ランダムクラスのインスタンスを生成
					Random rand = new Random();
					
				// 0から9の整数値をランダムに生成
					int n = rand.nextInt(2);
					
				// 生成した乱数を表示
					System.out.println(n);
					
					switch (n) {
					// nが0のときグーを表示しswitch文の実行を終了する
					case 0:  System.out.println("グー"); break;
					// nが0のときチョキを表示しswitch文の実行を終了する
					case 1:  System.out.println("チョキ"); break;
					// nが0のときパーを表示しswitch文の実行を終了する
					case 2:  System.out.println("パー"); break;
					}

	}

}
