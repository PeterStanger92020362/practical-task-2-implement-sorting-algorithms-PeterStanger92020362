import java.util.Arrays;
import java.util.Collections;

public class BubbleSortCustomerData {

    public static void main(String[] args) {

        //setup
        BubbleSortCustomerData bscd = new BubbleSortCustomerData();
        Customer custData[] = {
                new Customer("Tama",2,"Auckland"),
                new Customer("Amelia",5,"Taranaki"),
                new Customer("Kaos",3,"Hamilton"),
                new Customer("Karl",4,"Papatoetoe"),
                new Customer("Carlos",5,"Glenfield"),
                new Customer("Alicia",2,"Whangarai"),
                new Customer("Zion",2,"Wellington"),
                new Customer("Sara",3,"Auckland"),
                new Customer("Bob",4,"Papakura"),
                new Customer("Wiremu",5,"Auckland"),
        };


        System.out.println("Welcome to the Customer data sorter.\n");

        System.out.println("Here is the unsorted customer data: ");
        bscd.printArray(custData);

        bscd.doOptimisedBubbleSort(custData,"rating");
        System.out.println("Customer data after a bubble sort & by rating ascending: ");
        bscd.printArray(custData);

        bscd.doOptimisedBubbleSort(custData,"name");
        Collections.reverse(Arrays.asList(custData));
        System.out.println("Customer data after a bubble sort & by name descending: ");
        bscd.printArray(custData);




    }

    public void doOptimisedBubbleSort(Customer a[], String searchBy) {
        int lastSwap = a.length - 1;

        for (int i = 1; i < a.length; i++) {
            boolean is_sorted = true;
            int currentSwap = -1;

            for (int j = 0; j < lastSwap; j++) {

                if (searchBy.toLowerCase().equals("name")){

                    if (a[j].getName().compareTo(a[j + 1].getName()) > 0) {
                        Customer temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        is_sorted = false;
                        currentSwap = j;

                    }

                } else if (searchBy.toLowerCase().equals("rating")){

                    if (a[j].getRating() > (a[j + 1].getRating())) {
                        Customer temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        is_sorted = false;
                        currentSwap = j;

                    }

                }
            }

            if (is_sorted) {
                return;
            }
            lastSwap = currentSwap;
        }
    }

    void printArray(Customer arr[]) {
        int n = arr.length;
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i].getName() +
                    ", customer rating "+ arr[i].getRating() +
                    ", address " + arr[i].getAddress());
        }
        System.out.println();
        System.out.println();
    }
}
