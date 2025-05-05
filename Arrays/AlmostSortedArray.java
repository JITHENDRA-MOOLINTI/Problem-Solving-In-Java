package problems;

import java.util.Scanner;

public class AlmostSortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int target=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		//linear search for this array.This  is not sorted.
		boolean isPresent=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				System.out.println(i);
				isPresent=true;
				break;
			}
		}
		if(!isPresent) {
			System.out.println(-1);
		}
		//Binary Search-Optimize Solution
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==target) {
				System.out.println(mid);
				break;
			}
			 if(a[mid-1]==target&&mid>=low) {
				System.out.println(mid-1);
				break;
			}
			
			if(a[mid+1]==target&&mid<=high) {
				System.out.println(mid+1);
				break;
			}
			
		    if(target<a[mid]) {
		    	high=mid-2;
		    }
		    else {
		    	low=mid+2;
		    }
			
		}
	}

}
