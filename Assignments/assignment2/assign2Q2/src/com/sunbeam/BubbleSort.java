package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[], int n) {
		int cnt=0;
		
		for(int i=1; i<n; i++) {
			for(int j=0;j<n-i;j++) {
				cnt++;
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("No of Comparisons: "+cnt);
	}
	public static void main(String[] args) {
		int arr[] = {33,55,44,77,66,22,11};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		bubbleSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));	
	}
}
