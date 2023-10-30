package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(Arrays.toString(arr));
		Stack st = new Stack(arr.length);
		for (int i : arr) {
			st.push(i);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = st.pop();
		}
		System.out.println(Arrays.toString(arr));

	}

}
