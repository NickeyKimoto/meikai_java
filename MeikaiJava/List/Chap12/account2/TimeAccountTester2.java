package MeikaiJava.List.Chap12.account2;

//　is-Aの関係とインスタンスへの参照(メソッドの引数で検証)

public class TimeAccountTester2 {
	
	// どちらの預金残高が多いか
	static int compBalance(Account a, Account b) {
		
		if (a.getBalance() > b.getBalance()) {
			
			return 1; // aのほうが多い
			
		} else if (a.getBalance() < b.getBalance()) {
			
			return -1; // bのほうが多い
			
		} else {
			
			return 0; //aとbは同じ
			
		}
		
	}

	public static void main(String[] args) {

		Account adachi = new Account("足立幸一", "123456", 1000);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);
		
		switch (compBalance(adachi, nakata)) {
		
		case  0 : System.out.println("足立君と仲田君の預金残高は同じ。"); break;
		case  1 : System.out.println("足立君のほうが預金残高が多い。"); break;
		case -1 : System.out.println("仲田君のほうが預金残高が多い。"); break;
		
		}

	}

}
