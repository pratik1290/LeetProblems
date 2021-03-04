package leet.easy;

public class StringPalindrom {
	
	public static void main(String[] args) {
		
		//String input = "target";
		Integer input = 1221;
		System.out.println(IsPalindrom(input.toString())? "Is Palindrom" : "Not Palindrom");
	}

	private static boolean IsPalindrom(String input) {
		
			int i = 0;
			int j = input.length()-1;
			
			while(i<j) {
				
				System.out.println(input.charAt(i)+"-"+input.charAt(j));
				
				if(input.charAt(i) != input.charAt(j)) {
					return false;
				}
				j--;
				i++;
			}
		return true;
	}

}
