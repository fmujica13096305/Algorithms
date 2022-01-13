package company;

import java.util.Arrays;

public class BinarySearch {

    public static void main (String args[]){

        int array1 [] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        doSearch(array1 , 73);

    }

    // Returns either the index of the location in the array,
    // or -1 if the array did not contain the targetValue
    public static int doSearch(int[] array, int targetValue) {
        int min = 0;
        System.out.println(Arrays.toString(array));
        int max = array.length - 1;
        int guess;



        while (max >= min){
            System.out.println("Max : " + max);
            System.out.println("Min : " + min);

            guess = (max + min) /2;
            System.out.println("Average :" + guess);

            if (array[guess] == targetValue){
                System.out.println("guess--> :" + guess);
                return guess;
            }else if (array[guess] < targetValue){
                min = guess + 1;
            }else{
                max = guess - 1;
            }
        }
        return -1;
    }
}
