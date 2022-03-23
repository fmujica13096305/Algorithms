package main;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSubStrings {



	// This function receives input and returns palindromes list
	public static List<String> findAllPalindromeSubstrings(String inputString) {
		List<String> palindromes = new ArrayList<String>();
		// TODO: Write - Your - Code
		for (int i = 0 ; i < inputString.length(); i++ ) {
			//System.out.println("char : " + inputString);
			for (int j = i + 1 ; j < inputString.length()  ; j ++){
				if(isPalindrome(inputString , i , j)){
					palindromes.add(inputString.substring(i , j + 1));
				}

			}
		}

		return palindromes;
	}

	public static boolean isPalindrome(String input , int start , int last){
		while(start < last){
			if (input.charAt(start) == input.charAt(last)){
				start ++ ;
				last -- ;

			}else{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<String> result = new ArrayList<>();
		String arr[] = {"xxyyxxy"};
		for (int i = 0 ; i < arr.length ; i++ ) {
			result = findAllPalindromeSubstrings(arr[i]);
		}

		for (String r : result){
			System.out.println("list =" + result);

		}





	}


}
