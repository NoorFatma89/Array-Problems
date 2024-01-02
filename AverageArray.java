package com.practiceProblems.arrayProblems;

public class AverageArray {
	
	public static double average(int array[],int noOfElements) {
		double average=0;
		int sum=0,count=0;
		for(int i=1;i<noOfElements;i=i+2) {
			sum+=array[i];
			count++;
		}
		average=sum/count;
		return average;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 30, 50, 70, 90 }; 
		System.out.println("Average of elements present at even location is : "+average(arr, arr.length));
	}

}
