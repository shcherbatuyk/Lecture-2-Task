import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        /*
        Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder).
         */

        int arr[] = {2,3,1,7,11};
        int temp = 0;

        //Sorting an array in a cycle:
        for(int a = 0; a < arr.length; a++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println("Task 1:");
        System.out.print("arr[], sorted in a cycle: ");
        for (int i = 0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

        //Sorting an array using Java's "Arrays.sort() :"
        Integer arr2[] = {2,3,1,7,11};
        Arrays.sort(arr2, Collections.reverseOrder());

        System.out.print("\nArrays.sort(arr2[]) result: ");
        for (int i = 0; i<arr2.length; i++){
            System.out.print(arr[i] + " ");
        }

        /*
        You get an array of numbers(should contain both positive and negative numbers),
        and return the sum of all the positive ones. (If there are nothing to sum, sum should be 0)
         */

        int arr3[] = {-100, 24, 565, 24, -1, 0, 12, -196, -3, 14};
        int posSum = 0;

        for (int i =0; i< arr3.length; i++){
            if (arr3[i] > 0){
                posSum += arr3[i];
            }
        }
        System.out.println("\n\nTask 2:");
        System.out.println("Sum of all positive vals in arr3[]: " + posSum);

        /*
        You get an array of numbers, return the average of a list of numbers in this array. (Example -  array{1,2,4,1} -> avg = 2)
         */

        int arr4[] = {10, 4, 1, 1, 9, 15, 19};
        int varsSum = 0;
        float avg =0;

        for (int i = 0; i< arr4.length; i++) {
            varsSum = varsSum + arr4[i];
        }

        avg = (float)varsSum / (float) arr4.length;

        System.out.println("\nTask 3:");
        System.out.println("Average of arr4[] values: " + avg);

        /*
         You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0. Result should be  next: {3,2,0,1,4,0,8,0}
         */

        int arr5[] = {3,2,3,1,4,2,8,3};
        boolean currentValPresent = false;

        for (int m = 0; m<arr5.length; m++) {
            for (int i = 0; i < arr5.length; i++) {
                if (arr5[i] == arr5[m] && i!=m){
                    arr5[i]=0;
                }
            }
        }

        System.out.println("\nTask4: ");
        System.out.print("Duplicated values in arr5[] replaced by 0: ");
        for (int i = 0; i<arr5.length-1; i++)
        {
            System.out.print(arr5[i] + ",");
        }
        System.out.println(arr5[arr5.length-1]);
    }
}