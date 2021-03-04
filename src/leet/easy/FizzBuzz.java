package leet.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {
	
	static ArrayList<String> result = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		for(int i = 0; i<=list.size()-1; i++) {
			fizzbuzz(list.get(i));
		}
		System.out.println(result);
	}

	 static void fizzbuzz(int i) {
		
		if(i%3 ==0 & i%5 == 0) {
			result.add("\n"+"FizzBizz");
		}else if(i%3 == 0) {
			result.add("\n"+"Fizz");
		}else if(i%5 == 0) {
			result.add("\n"+"Bizz");
		}else {
			result.add("\n"+Integer.toString(i));
		}
	}
	

}
