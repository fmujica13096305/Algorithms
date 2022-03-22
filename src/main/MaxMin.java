package main;

public class MaxMin {
    public static void main (String [] args){
        int[] arr = {-1 , 5 , 10 ,5, 2};

        maxMin(arr);

        for (int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i] + " ");
        }

    }



    public static void maxMin(int[] arr) {

        // Write - Your - Code
        int max = 0;
        int min = 0;
        int maxPos = 0;
        int minPos = 0;
        int temp = 0;

        for (int i = 0 ; i<arr.length ; i++){
             max = arr[i];
             min = arr[i];


            for (int j = i + 1 ; j<arr.length ; j++){

                if (arr[i] < arr[j] ){
                    if (arr[j] > max){
                        max = arr[j];
                        minPos = j;
                    }
                }

                if (arr[i] > arr[j]){
                    if (arr[i] < min){
                        min = arr[i];
                        maxPos = j;

                    }
                }
            } //end inner loop

            if (i%2 == 0){
                //pair is max
                temp = arr[i];
                arr[i] = max;
                arr[maxPos] = temp;

            }else{
                //odd is min
                temp = arr[i];
                arr[i] = min;
                arr[minPos] = temp;
            }
        }
    }

}
