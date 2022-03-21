package company;

import java.util.Arrays;

public class RemoveSpaces {

    public static void main(String[] args) {
        String sentence = "hola mundo cruel";
        char str[] = sentence.toCharArray();
        String r = removeWhiteSpaces(str);
        System.out.println(r);
    }

    static String removeWhiteSpaces(char[] s) {
        // TODO: Write - Your - Code


        int readIndex = 0;
        int writeIndex = 0;

        while (readIndex < s.length){

            if (!hasWhiteSpaces(s[readIndex])){
                s[writeIndex] = s[readIndex];
                writeIndex++;
            }
            readIndex++;

        }



        String re = String.valueOf(Arrays.copyOfRange(s, 0 , writeIndex));

        return re;
    }


    private static boolean hasWhiteSpaces(char letter){
        if (letter == ' ' || letter == '\t'){
            return true;
        }
     return false;
    }



}
