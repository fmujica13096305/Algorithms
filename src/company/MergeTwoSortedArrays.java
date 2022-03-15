package company;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String args[]) {

        int[] array1 = {1, 3, 4, 5};
        int[] array2 = {2, 6, 7, 8};

        mergeTwoArrays(array1,array2);
    }


        public static void mergeTwoArrays(int[] arr1, int[] arr2) {
            // write your code here
            int arrayLength1 = arr1.length;
            int arrayLength2 = arr2.length;
            int finalLength = arrayLength1 + arrayLength2;
            int finalArray[] =  new int [finalLength];

            int i = 0;
            int j = 0;
            int count = 0;

            while (i < arrayLength1 && j < arrayLength1 ){
                if (arr1[i] < arr2[j]){
                    System.out.println("array  :" + arr1[i]);
                    finalArray[count++] =  arr1[i];
                    i++;
                } else {
                    System.out.println("array  :" + arr2[j]);
                    finalArray[count++] =  arr2[j];
                    j++;
                }


                //System.out.println("length :" + finalArray.length);

            }

            while (i < arrayLength1){
                finalArray[count++] =  arr1[i++];
            }

            while (j< arrayLength2){
                finalArray[count++] =  arr2[j++];
            }

            System.out.println("array :" + Arrays.toString(finalArray));


    }
}