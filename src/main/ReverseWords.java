package main;

public class ReverseWords {

    public static void main (String args[]){
        String sentence = "hola mundo";
        char str[] = sentence.toCharArray();
        reverseWords(str);

    }



    public static String reverseWords(char[] sentence) {
        // TODO: Write - Your - Code
        int start = 0;
        int end = sentence.length;
        int strLen = sentence.length;
        char temp;

        reverseSentence(sentence, start, end);

        start = 0;
        end = 0;

        while (true) {
            if (start >= strLen - 1) {
                break;
            }

            // find the start index of a word while skipping spaces.
            while (sentence[start] == ' ') {
                start++;
            }

            // find the end index of the word.
            end = start + 1;
            while (end < strLen  && sentence[end] != ' ') {
                end++;
            }

            // let's reverse the word in-place.
            reverseSentence(sentence, start, end );
            start = end;
        }

        for (char c : sentence) {
            System.out.println("" + c);
        }
        //String ansStr = String.valueOf(Arrays.copyOfRange(s, 0, writePtr));

        return String.valueOf(sentence);
    }

    private static void reverseSentence(char[] sentence, int start, int end) {
        char temp;
        while(start < end - 1){
            temp = sentence[start];
            sentence[start] = sentence[end - 1];
            sentence[end - 1] = temp;
            start++;
            end--;
        }
    }

}
