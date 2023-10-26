package com.sunbeam;

import java.util.Scanner;

public class RankOfNo {

	public static int rankingOfNumber(int arr[], int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (key >= arr[i])
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.print("Enter No to find Rank- ");
		int key = sc.nextInt();
		int ranking = rankingOfNumber(arr, key);
		System.out.println("Ranking of the key(" + key + ") is : " + ranking);
		sc.close();
	}
}
