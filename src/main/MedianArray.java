
package main;

public class MedianArray {

    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 8};
        int[] array2 = {10, 12, 14, 16, 18, 200};

        FindMediaArray(array1, array2);


    }


    private static void FindMediaArray(int[] arrayA, int[] arrayB) {
        int midResult = (arrayA.length/2);
        int midResult2 = (arrayB.length/2);

        double sum = (arrayA[midResult] + arrayB[midResult2])/2.0;

        System.out.println("median : " + sum);

    }


}

