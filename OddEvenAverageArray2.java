package com.practiceProblems.arrayProblems;

import java.util.Scanner;

public class OddEvenAverageArray2 {
	int evenSum,oddSum;
	public void oddEvenElementAvg(int array[],int size) {
		for(int i=0;i<size;i++) {
			if(i%2==0) 
				evenSum+=array[i];
			else
				oddSum+=array[i];
		}
		int average=(evenSum+oddSum)/2;
		System.out.println("Average of Elements present at Even and Odd Index is : " +average);
	}
	public static void main(String[] args) {
		OddEvenAverageArray object=new OddEvenAverageArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size=scanner.nextInt();
		int [] array=new int [size];
		System.out.println("Enter Elements of the array : ");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		object.oddEvenElementAvg(array);
		scanner.close();
	}

}
