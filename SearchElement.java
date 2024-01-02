package com.practiceProblems.arrayProblems;
import java.util.Scanner;

public class SearchElement{    
	public static int Search(int[] array, int element){    
        for(int i=0;i<array.length;i++){    
            if(array[i] == element){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] arr= {10,20,30,50,70,90}; 
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the element to be search : ");
        int element=scanner.nextInt(); 
        System.out.println(element+" is present at index: "+Search(arr, element));
        scanner.close();
    }    
}
