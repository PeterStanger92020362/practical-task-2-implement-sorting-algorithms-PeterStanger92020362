/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.util.Arrays.sort;

/**
 *
 * @author Jeff
 */
public class JavaSort {
    
 
    /* Prints the array */
    void printArray(CatalogueItem arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(
                    "id: " + arr[i].getItemId() + " "
                    + "name: " + arr[i].getItemName() + " "
                    + "category: " + arr[i].getCategory() + "\n");
        System.out.println();
        System.out.println();
    }


    public void doOptimisedBubbleSort(CatalogueItem a[] ) {
        int lastSwap = a.length - 1;

        for (int i = 1; i < a.length; i++) {
            boolean is_sorted = true;
            int currentSwap = -1;

            for (int j = 0; j < lastSwap; j++) {

                if (a[j].getItemId() > (a[j + 1].getItemId())) {
                    CatalogueItem temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    is_sorted = false;
                    currentSwap = j;

                }


            }

            if (is_sorted) {
                return;
            }
            lastSwap = currentSwap;
        }
    }


    // Driver method to test above
    public static void main(String args[])
    {
        JavaSort ob = new JavaSort();
        
        CatalogueItem arr[] = {
            new CatalogueItem( 3, "Life of Pi","Books"),
            new CatalogueItem( 7, "Deelongie 4 way toaster","Home and Kitchen"),
            new CatalogueItem( 2, "Glorbarl knife set","Home and Kitchen"),
            new CatalogueItem( 4, "Diesorn vacuum cleaner","Appliances"),
            new CatalogueItem( 5, "Jennie Olivier sauce pan","Home and Kitchen"),
            new CatalogueItem( 6, "This book will save your life","Books"),
            new CatalogueItem( 9, "Kemwould hand mixer","Appliances"),
            new CatalogueItem( 1, "Java for Dummies","Books"),
        };
        System.out.println("The Unsorted array is");
        ob.printArray(arr);

        /*
         //apply sort
        ob.doOptimisedBubbleSort(arr);
        System.out.println("The array sorted by category using Java built in sort is");
        ob.printArray(arr);
         */

        sort(arr);
        System.out.println("The array sorted by category using Java built in sort is");
        ob.printArray(arr);

        System.out.println("The algorithm that is most efficient is the Java built in sort.\n\n" +
                "It uses Timsort, which has on average is the same level of time complexity\n" +
                "as Quicksort - O(n log(n)).  But Timsort is better at it's best and worst\n" +
                "when compared with Quicksort.\n\n" +
                "Quicksort best = O(n log(n))  worst = O(n^2)\n" +
                "Timsort   best = O(n)         worst = O(n log(n))\n" +
                "\n" +
                "This means at it's best, Timsort will only have to traverse the array 'n' times, to sort.\n" +
                "And Quicksort at it's worst will have to check an array length squared amount of elements.\n");

    }
}
