package MeikaiJava.List.Chap07;

public class L_07_14_C4 {
	
	static int countBits(int x) {
		
		int bits = (x >> 1) & 03333333333;
		bits = x - bits - ((bits >> 1) & 03333333333);
		bits = ((bits + (bits >> 3)) & 0707070707) % 077;
		
		return bits;
		
	}

	public static void main(String[] args) {

	}

}
