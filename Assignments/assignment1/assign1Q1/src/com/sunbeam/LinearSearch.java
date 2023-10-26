package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[], int size, int key) {
		for(int i=0; i<size; i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= {33,55,77,66,44,11,99,88};
		
		System.out.print("Enter the Key to Search- ");
		int key = sc.nextInt();
		
		int index=linearSearch(arr, arr.length, key);
		if (index==-1)
			System.out.println("Key not found");
		else
			System.out.println("Key found at "+index+" th index");
		sc.close();
	}
	
}
