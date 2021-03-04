package leet.easy;

public class NumPalindrom {
	
	public static void main(String[] args) {

        int num = 132231;

        
        int reversed = IsPalandrom(num);
        System.out.println((num == reversed)?"Is palindrom": "Not Palindrom");
    }

	private static int IsPalandrom(int num) {
		
		int reversed = 0;
		
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
	}

}
