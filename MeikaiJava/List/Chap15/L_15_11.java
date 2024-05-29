package MeikaiJava.List.Chap15;
//文字列の配列(1文字ずつ表示)
public class L_15_11 {

	public static void main(String[] args) {
		String[] sx = {"Turbo", "NA", "DOHC"};
		
		for (int i = 0; i < sx.length; i++) {
			System.out.print("sx[" + i + "] = \"");
			for (int j = 0; j < sx[i].length(); j++) {
				System.out.print(sx[i].charAt(j));
			}
			System.out.println('\"');
		}
	}

}
