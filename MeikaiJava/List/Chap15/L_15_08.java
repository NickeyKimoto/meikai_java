package MeikaiJava.List.Chap15;
// String.formatメソッドによる文字列の作成
public class L_15_08 {

	public static void main(String[] args) {
		String s1 = String.format("%5d",    123);
		String s2 = String.format("%9.3f",  123.45);
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}

}
