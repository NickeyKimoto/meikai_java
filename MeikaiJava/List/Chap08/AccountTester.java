package MeikaiJava.List.Chap08;

// 銀行口座クラス【第1版】とそれをテストするクラス

// 銀行口座クラス【第1版】

class Account {
	
	String Name;    // 口座名義
	String No;      // 口座番号
	long   Balance; // 預金残高
	
}

// 銀行口座クラスをテストするクラス

public class AccountTester {

	public static void main(String[] args) {

		Account adachi = new Account(); // 足立君の口座
		Account nakata = new Account(); // 仲田君の口座
		
		adachi.Name    = "足立幸一"; // 足立君の口座名義
		adachi.No      = "123456";   //       の口座番号
		adachi.Balance = 1000;       //       の預金残高
		
		nakata.Name    = "仲田真二"; // 仲田君の口座名義
		nakata.No      = "654321";   //       の口座番号
		nakata.Balance = 200;        //       の預金残高
		
		adachi.Balance -= 200;              // 足立君が200円おろす
		nakata.Balance += 100;              // 仲田君が100円預ける
		
		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.Name);
		System.out.println("　口座番号：" + adachi.No);
		System.out.println("　預金残高：" + adachi.Balance);
		
		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.Name);
		System.out.println("　口座番号：" + nakata.No);
		System.out.println("　預金残高：" + nakata.Balance);

	}

}
