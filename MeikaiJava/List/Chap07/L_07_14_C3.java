package MeikaiJava.List.Chap07;

public class L_07_14_C3 {
	
	static int countBits(int x) {
		
		int bits = 0;
		for( ; x != 0; x &= x - 1) {
			
			bits++;
			
		}
		
		return bits;
		
	}

	public static void main(String[] args) {

	}

}
