package com.practiceProblems.arrayProblems;

import java.util.Scanner;

class BinarySearch {
 
    int binarySearch(int array[], int lower, int upper, int element)
    {
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
 
            if (array[mid] == element) {
                return mid;
 
            } else if (array[mid] > element) {
            	upper = mid - 1;

            } else {
            	lower = mid + 1;
            }  
        }
 
        return -1;
    }

    public static void main(String args[])
    {
        BinarySearch object = new BinarySearch();
 
        int array[] = { 2, 3, 4, 10, 40 };
        int noOfElement = array.length;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the element to be search : ");
        int element=scanner.nextInt();
        int result = object.binarySearch(array, 0, noOfElement - 1, element);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
        scanner.close();
    }
}
