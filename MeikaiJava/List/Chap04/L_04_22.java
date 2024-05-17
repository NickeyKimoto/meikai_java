package MeikaiJava.List.Chap04;

// 九九の表を表示(System.out.printfを利用)

public class L_04_22 {

	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				
				System.out.printf("%3d", i * j);
				
			}
			
			System.out.println();
			
		}

	}

}
