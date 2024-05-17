package MeikaiJava.List.Chap07;

// int型の値を左右にシフトした値を表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_13 {

	//--- int型のビット構成を表示 ---//
	static void printBits(int x) {

		for (int i = 31; i >= 0; i--) {

			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');

		}

	}

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		System.out.print("整数：");
		int x = standardInput.nextInt();
		System.out.print("シフトするビット数");
		int n = standardInput.nextInt();

		System.out.print("  整数    = "); printBits(x);
		System.out.print("\nx <<  n = "); printBits(x << n);
		System.out.print("\nx >>  n = "); printBits(x >> n);
		System.out.print("\na >>> n = "); printBits(x >>> n);

	}

}
