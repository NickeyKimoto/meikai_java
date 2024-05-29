package MeikaiJava.List.Chap12;

// 会員クラスのテスト

public class MemberTester {

	public static void main(String[] args) {

		// Member型変数は、SpecialMemberも参照可能
		Member[] m = {
				
			new Member("橋口", 101, 27),
			new SpecialMember("黒木", 102, 31, "会費無料"),
			new SpecialMember("松野", 103, 52, "会費半額免除"),
				
		};
		
		for (Member k : m) {
			
			// 動的結合:参照先のクラス型のメソッドが呼び出される
			k.print();
			System.out.println();
			
		}

	}

}
