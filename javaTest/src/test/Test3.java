package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		
		ArrayList<Integer[]> arr =  new ArrayList<Integer[]>();
		
		arr.add( new Integer[]{ 11, 12, 13, 14 } );
		arr.add( new Integer[]{ 21, 22, 23, 24 } );
		arr.add( new Integer[]{ 31, 32, 33, 34 } );
		
		// Test3 전체 요소 출력하기
		/*
		 * 11 12 13 14 
		 * 21 22 23 24 
		 * 31 32 33 34 
		 */
		// ver1
		arr.stream().forEach(v -> {
			System.out.println(Arrays.toString(v));
		});

		System.out.println();
		// ver2
		for(Integer[] numbers: arr) {
			System.out.println(Arrays.toString(numbers)); 
		}
		
		System.out.println();
		// ver3
		// 정규 for구문
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).length; j++) {
				if(arr.get(i).length-1 == j) {
					System.out.println(arr.get(i)[j]);
				}else {
					System.out.print(arr.get(i)[j] + " ");
				}
				
			}
		}
		
	}
}
