package company;

import java.util.Arrays;

public class InsertionSort {


    public static void main (String args[]){

        int[] array = {};

        int key = 0;
        if (array.length > 0){
             key = array[0];
        }


        System.out.println("aaa" + key);

        for (int i = 1 ; i < array.length ; i++)
        {

            if ( key > array[i] ){
                key = array[i];
                insert(array , i -1 , key);
            }
        }

        System.out.println(Arrays.toString(array));

        // expected output : {-99, -1, 0, 1, 2, 3, 4}


    }


    static void insert(int[] array, int rightIndex, int value) {
        for ( int i = rightIndex ; i >= 0 ; i --){
            System.out.println(i);
            if (array[i] >= value){
                array[i+1] = array[i];
                array[i] = value;
            }
        }
    }

}
