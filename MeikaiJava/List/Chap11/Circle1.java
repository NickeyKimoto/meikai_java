package MeikaiJava.List.Chap11;

// 円の面積を求める

// 単一型インポート宣言
import java.util.Scanner;

public class Circle1 {

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		System.out.println("円の面積を求めます。");
		System.out.print("半径：");
		double r = standardInput.nextDouble();
		System.out.println("面積は" + (Math.PI * r * r) + "です。");

	}

}
