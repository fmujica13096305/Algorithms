package company;

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

        while(start > end){
            sentence[start] = sentence[end];
            start++;
            end--;
        }


        for (char c : sentence) {
            System.out.println("" + c);
        }









        return String.valueOf(sentence);
    }

}
