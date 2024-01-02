package com.practiceProblems.arrayProblems;

public class Reverse2 { 
	  
    static void reverseArray(int array[], int noOfElements) 
    { 
        int i, k, temp; 
        for (i = 0; i < noOfElements / 2; i++) { 
        	temp = array[i]; 
            array[i] = array[noOfElements - i - 1]; 
            array[noOfElements - i - 1] = temp; 
        } 
  
        System.out.println("Reversed array is : "); 
        for (k = 0; k < noOfElements; k++) { 
            System.out.print(array[k]+ " "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int[] arr = { 5, 10, 15, 20, 25 }; 
        reverseArray(arr, arr.length); 
    } 

}
