package com.practiceProblems.arrayProblems;

public class Reverse {
	static void reverseArray(int array[], int noOfElements) 
    { 
        int[] tempArray = new int[noOfElements]; 
        int j = noOfElements; 
        for (int i = 0; i < noOfElements; i++) { 
        	tempArray[j - 1] = array[i]; 
            j = j - 1; 
        } 
  
        System.out.println("Reversed array is : "); 
        for (int k = 0; k < noOfElements; k++) { 
            System.out.print(tempArray[k]+ " "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int [] arr = {10, 20, 30, 40, 50}; 
        reverseArray(arr, arr.length); 
    } 

}
