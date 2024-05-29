package MeikaiJava.List.Chap15;
// ジャンケン

import java.util.Random;
import java.util.Scanner;

public class L_15_13 {

	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in);
		Random randomVariable = new Random();

		String[] hands = {"グー", "チョキ", "パー"};
		int retry; // もう一度行うか？
		
		do {
			// コンピュータの手を0,1,2の乱数として生成
			int comp = randomVariable.nextInt(3);
			
			// プレーヤの手を0,1,2で読み込む
			int user;
			
			do {
				System.out.print("ジャンケンポン");
				for (int i = 0; i < 3; i++) {
					System.out.printf("(%d)%s ", i, hands[i]);
				}
				System.out.print(":");
				user = standardInput.nextInt();
			} while (user < 0 || user > 2);
			
			// 両者の手を表示
			System.out.println("私は" + hands[comp] + "で、あなたは" + hands[user] + "です。");
			
			// 判定
			int judge = (user - comp + 3) % 3;
			switch (judge) {
			case 0 : System.out.println("引き分けです。"); break;
			case 1 : System.out.println("あなたの負けです。"); break;
			case 2 : System.out.println("あなたの勝ちです。"); break;
			}
			
			// もう一度行うかどうかを確認
			do {
				System.out.print("もう一度？ (0)いいえ (1)はい：");
				retry = standardInput.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}

}
