package mypossibilities;

import java.lang.Math;

public class MyPossibilities {

    public static void main(String[] args) {
        int array[] = {0, 1, 2, 3, 4, 5, 6, 7};
        bubbleSort(array);
        
    }

    static void bubbleSort(int array[]) {
        int n = array.length; //8
        int temp;
        int count = 0;
        int lowestsum = 1000000000;
        int tempdiff = 0;
        int middle = n / 2; //4
        int rightarray[] = new int[n]; //size 8
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                //Below 3 lines = swap
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                int temp1sum = 0;
                int temp2sum = 0;

                count = count + 1; //Number of possibilities
                //Below loop prints all possibilities
                for (int w = 0; w < n; w++) {
                    System.out.print(array[w]);
                }
                System.out.println("");
                int temp1[] = new int[middle]; //size 4 with indexes 0-3
                int temp2[] = new int[middle]; //size 4 with indexess 0-3
                //Copies first half of array into temp1
                for (int x = 0; x < middle; x++) {
                    temp1[x] = array[x];
                    temp1sum = temp1sum + temp1[x];
                }
                //Copies second half of array into temp2
                for (int x = 0; x < middle; x++) {
                    temp2[x] = array[x + middle];
                    temp2sum = temp2sum + temp2[x];
                }

                tempdiff = Math.abs(temp1sum - temp2sum);

                if (tempdiff < lowestsum) {
                    lowestsum = tempdiff;
                    for (int z = 0; z < n; z++) {
                        rightarray[z] = array[z];
                    }
                }
            }
        }
        System.out.println();
        System.out.println("We found " + count + " total combinations.");
        System.out.print("The minimum difference of two sublists is " + lowestsum);
        System.out.println();
        System.out.println("The most fantastic list is: ");
        for (int w = 0; w < n; w++) {
            System.out.print(rightarray[w]);
        }
        System.out.println();
        System.out.println("Hours of work spent on this idea / code: 10");
    }
}
