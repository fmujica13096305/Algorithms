package company;

public class RemoveSpaces {

    public static void main(String[] args) {
        String sentence = "aaabcccdhsdhs";
        char str[] = sentence.toCharArray();
        removeWhiteSpaces(str);
    }

    static String removeWhiteSpaces(char[] s) {
        // TODO: Write - Your - Code


        int readIndex = 0;
        int writeIndex = 0;

        while (true){

            if (!hasWhiteSpaces(s[readIndex])){
                s[writeIndex] = s[readIndex];
                readIndex++;
            }
            writeIndex++;
        }




        return new String(s);
    }


    private static boolean hasWhiteSpaces(char letter){
        if (letter == ' ' || letter == '\t'){
            return true;
        }
     return false;
    }



}
