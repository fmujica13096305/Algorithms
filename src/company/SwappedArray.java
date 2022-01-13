package company;

import java.util.Arrays;

public class SwappedArray {
    public static void main (String args[]) {

        int[] array1 = {1, 2, 3, 4};
        swap(array1,0,1);
    }


    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int[] swappedArray = new int[array.length];
        System.out.println("array.length : " + swappedArray.length);

        for (int i = 0 ; i < array.length; i++ )
        {
            if(secondIndex == i ){

                swappedArray[i] = array[firstIndex];
                System.out.println("swappedArray :" + swappedArray[i]);
            } else if (firstIndex == i){
                swappedArray[i] = array[secondIndex];
                System.out.println("swappedArray 2:" + swappedArray[i]);
            } else {
                swappedArray[i] = array[i];
                System.out.println("swappedArray 3:" + swappedArray[i]);
            }

        }

        System.out.println(Arrays.toString(swappedArray));

    }
}

