package LoopStatement;

public class ForEach_Loop_Asc_Desc {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        // Ascending Order using for-each
        System.out.println("Ascending Order:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        // Descending Order using for loop
        System.out.println("\nDescending Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
