package main;

import java.util.Arrays;

public class insertSort {

    public static void main (String[] args){
        int[] array2 = {2, 3, 5, 7, 11, 13, 9, 6};

        insert(array2, 5, 9);
    }


    public static void insert(int[] array, int rightIndex, int value) {
        // write this method
        for ( int i = rightIndex ; i >= 0 ; i --){
            System.out.println(i);
            if (array[i] > value){
                array[i+1] = array[i];
            }else if (array[i] == value){
                array[i] = value;
            }else {
               // array[i] = value;
            }
        }

        System.out.println(Arrays.toString(array));

    }

}
