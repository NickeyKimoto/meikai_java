package MeikaiJava.List.Chap15;

// 空参照と空文字列

public class L_15_02 {

	public static void main(String[] args) {
		String s1 = null; // 空参照(参照していない)
		String s2 = ""; // ""を参照
		
		System.out.println("文字列s1 = " + s1);
		System.out.println("文字列s2 = " + s2);
	}

}
