package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergeKSortedArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("-----------------------------------");

		ArrayList<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				l1.add(arr[i][j]);
			}
		}
		Collections.sort(l1);
		for (int n : l1) {
			System.out.print(n + " ");
		}

		ArrayList<Integer> l2 = new ArrayList<>();
		for (int row[] : arr) {
			for (int val : row) {
				l2.add(val);
			}
		}
		
		Collections.sort(l2);
		for (int n : l2) {
			System.out.print(n + " ");
		}
		
	}

}
