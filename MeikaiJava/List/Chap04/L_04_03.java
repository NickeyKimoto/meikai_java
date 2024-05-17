package MeikaiJava.List.Chap04;

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;


public class L_04_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
				Scanner stdIn = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random rand = new Random();
		
		// 当てるべき数を1～99の乱数として生成
		int no = rand.nextInt(100);

		// ゲームタイトルを表示
		System.out.println("数当てゲーム開始！！");
		// ゲームルールを表示
		System.out.println("０～９９の数を当ててください。");
		
		// プレイヤーが入力した数を初期化
		int x;
		
		// 繰り返される範囲、ループ本体
		do {
			// 数の入力を促す
			System.out.print("いくつかな：");
			// 入力された数を読み込む
			x = stdIn.nextInt();
			
			// 入力された数が当てるべき数より大きい場合
			if (x > no)
				// ヒントを表示
				System.out.println("もっと小さな数だよ。");
			
			// 入力された数が当てるべき数より小さい場合
			else if (x < no)
				// ヒントを表示
				System.out.println("もっと大きな数だよ。");
			// 不正解であればループ本体が再び実行される
		} while (x != no);
		
		// 正解であれば表示する
		System.out.println("正解です。");
	}

}
