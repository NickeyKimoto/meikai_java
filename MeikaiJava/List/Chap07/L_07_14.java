package MeikaiJava.List.Chap07;

// int型整数中の1であるビット数をカウント

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_14 {

	//--- int型のビット構成を表示 ---//
	static void printBits(int x) {

		for (int i = 31; i >= 0; i--) {

			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');

		}

	}
	
	//--- int型整数x中の1であるビット数をカウント ---//
	static int countBits(int x) {
		
		int bits = 0;
		while(x != 0) {
			
			if((x & 1) == 1) {
				
				bits++; // 最下位ビットは1であるか？
				
			}
			
			x >>>= 1; // 調べ終わった最下位ビットをはじき出す
			
		}
		
		return bits;
		
	}

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		System.out.print("整数：");
		int x = standardInput.nextInt();
		
		System.out.print("ビット構成 = ");
		printBits(x);
		System.out.println("\n1であるビット数 = " + countBits(x));

	}

}
