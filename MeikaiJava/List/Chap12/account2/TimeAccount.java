package MeikaiJava.List.Chap12.account2;

// 定期預金付き銀行口座クラス【第1版】

class TimeAccount extends Account {
	
	private long timeBalance; // 預金残高(定期預金)
	
	// コンストラクタ
	TimeAccount(String name, String no, long balance, long timeBalance) {
		
		super(name, no, balance); // クラスAccountのコンストラクタの呼び出し
		this.timeBalance = timeBalance; // 預金残高(定期預金)
		
	}
	
	// 定期預金残高を調べる
	long getTimeBalance() {
		
		return timeBalance;
		
	}
	
	// 定期預金を解約して全額を普通預金に移す
	void cancel(long k) {
		
		deposit(timeBalance);
		timeBalance = 0;
		
	}

}
