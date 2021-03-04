package leet.easy;

public class FacTrailingZeros {
	
	public static void main(String[] args) {
		
		int input = 10;
		
		System.out.println(numberOfTrailingZeros(input));
	}

	private static int numberOfTrailingZeros(int input) {
		
		int zeros = 0;
		while(input>0) {
			input/=5;
			zeros+=input;
		}
		return zeros;
	}

}
