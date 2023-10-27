package com.sunbeam;

import java.util.Arrays;

public class InsertionSortDesc {

	public static void insertionSortDesc(int arr[], int n) {

		int cnt=0;
		for(int i=1; i<n; i++) {
			int temp= arr[i];
			int j= i-1;
			while(j>=0 && arr[j]< temp) {
				arr[j+1]= arr[j];
				j--;
				cnt++;
			}
			arr[j+1]=temp;
		}
		System.out.println("Comparison ="+ cnt);
	
	}
	
	
	public static void main(String[] args) {

		int arr[] = {44,55,33,11,22,66};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSortDesc(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	
	}

}
