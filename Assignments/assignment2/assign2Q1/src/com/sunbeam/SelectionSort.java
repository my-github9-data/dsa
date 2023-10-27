package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int arr[], int n) {
		for(int i=0; i<n-1;i++) {
			for(int j=1+i; j<n; j++) {
				if(arr[i]> arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {22,66,44,11,55,33};
		
		System.out.println("Array Before Sort: "+Arrays.toString(arr));
		selectionSort(arr, arr.length);
		System.out.println("Array After Sort: "+Arrays.toString(arr));
		
	}

}
