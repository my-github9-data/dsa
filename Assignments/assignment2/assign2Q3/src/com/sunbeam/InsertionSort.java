package com.sunbeam;
import java.util.Arrays;
public class InsertionSort {

	public static void insertionSort(int arr[], int n) {
		int cnt=0;
		for(int i=1; i<n; i++) {
			int temp= arr[i];
			int j= i-1;
			while(j>=0 && arr[j]> temp) {
				arr[j+1]= arr[j];
				j--;
				cnt++;
			}
			arr[j+1]=temp;
		}
		System.out.println("Comparison ="+ cnt);
	}
	
	public static void main(String[] args) {
		int arr[] = {66,55,44,33,22,11};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
