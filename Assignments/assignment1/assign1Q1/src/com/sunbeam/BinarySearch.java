package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int size, int key) {
		int left=0 ,right= size-1 , mid;
		while (left<=right) {
			mid=(left+right)/2;
			
			if(key==arr[mid])
				return mid;
			else if(key<arr[mid])
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int arr[]= {11,22,33,44,55,66,77,88,99};
		
		System.out.print("Enter the Key to Find- ");
		int key= sc.nextInt();
		
		int index = binarySearch(arr, arr.length, key);
		if(index!= -1)
			System.out.println("Key found at "+index+"th index");
		else
			System.out.println("Key not Found"); 
		
		sc.close();
	}

}
