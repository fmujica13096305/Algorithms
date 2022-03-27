package main;

public class LPSC {

    public static void main (String args[]){
        String s  = "abdbca";
        int result = countPalindromeSubstring(s);
        System.out.println ("" + result);

    }


    private static int countPalindromeSubstring(String inputString){
        int count = inputString.length();


        //passthrough array
        for (int i = 0; i < inputString.length() ; i++){
            for (int j = 0 ; j < i ; j++){
                if  (isPalindrome(inputString , j , i)){
                    count++;
                }
            }
        }


        return count;
    }


    private static boolean isPalindrome(String input, int start, int last){
        while (start < last){
            if (input.charAt(start) == input.charAt(last)){
                start++;
                last--;
            } else {
                return false;
            }
        }
        return true;
    }




}
