package com.practiceProblems.arrayProblems;

public class ArraySorting{
	public static void sorting(int array[]) {
		System.out.println("Array elements after sorting:"); 
		for (int i = 0; i < array.length; i++) {  
			for (int j = i + 1; j < array.length; j++) {  
				int temp = 0;  
				if (array[i] > array[j]) {  
					temp = array[i];  
					array[i] = array[j];  
					array[j] = temp;  
				}  
			} 
			System.out.println(array[i]);  
		}  
	}

	public static void main(String[] arg)   
	{  
		int array[]= {74, 23, 6, -2, 45, 90, -76, 56, -6, 65, 12, 85};
		sorting(array);			
	}  
	
}
