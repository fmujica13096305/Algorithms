package company;

public class UniqueValue {

    public static void main (String[] args){


        boolean response = isUniqueChars("abc");
        System.out.println(response);
    }



    private  static boolean isUniqueChars(String str) {
        boolean [] asciiArray = new boolean[255];

        for (int i = 0 ; i < str.length() ; i++){
            int asciiValue = str.charAt(i);
            if (asciiArray[asciiValue]){
                return false;

            }else{
                asciiArray[asciiValue] = true;
            }

        }


        return true;
    }


}
