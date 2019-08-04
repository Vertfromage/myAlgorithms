package com.crystal;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        int[] sortedIntegers = sortIntegers(myIntegers);
        printArray(sortedIntegers);
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
    // This was the fun part, the last sorting algorithm I wrote was in python so it was fun to remember how to do it.
    //  It's a Selection Sort https://www.geeksforgeeks.org/selection-sort/ so not the best algorithm
    // https://techdifferences.com/difference-between-bubble-sort-and-selection-sort.html I guess mine is better than bubble sort but not 
    // as efficient as something like merge sort or quick sort. https://www.titrias.com/ultimate-sorting-algorithms-comparison/
    public  static int[] sortIntegers(int[] array){
        //implement sorting algorithm
        int n = array.length;
        for(int i= 0;i<n; i++){
            int high = array[i];
            int indexHigh = i;
            for(int j=i;j<n; j++){
                if (array[j]>high){
                    high = array[j];
                    indexHigh = j;
                }
            }
            array[indexHigh] = array[i];
            array[i] = high;
        }
        return array;
    }
    //
    // This is Tim Buchalka's code, it's much simpler and probably has better bigO time. It seeems familiar. 
    // It's bubble sort https://www.geeksforgeeks.org/bubble-sort/ he optomized it to stop in no swaps happen
    
        public static int[] timSortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
