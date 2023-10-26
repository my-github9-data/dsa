package assign1Q4;

import java.util.Scanner;

public class NthOccur {

	public static int linearSearchNthOccur(int arr[], int size, int key){
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==size) {
				count++;
				if(count==key) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = { 30, 50, 10, 30, 30, 70, 60, 30 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		System.out.print("Find the Nth Occurence : ");
		int nth=sc.nextInt();

		int index = linearSearchNthOccur(arr, key, nth);
		if (index != -1) 
			System.out.println("The "+nth+"nth occurence of "+key+" is at index "+index);
		else 
			System.out.println("The "+nth+"nth occurence of "+key+" is not found");
		
		sc.close();
	}

}
