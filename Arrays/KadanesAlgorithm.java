package Arrays;

import java.util.Scanner;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		//2 3 -8 7 -1 2 3
		//Approach - 1 : Brute force
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			int currentSum=0;
			for(int j=i;j<a.length;j++) {
				currentSum+=a[j];
			
				if(currentSum>maxSum) {
					maxSum=currentSum;
					
				}
			}
		}
		
		System.out.println(maxSum);
		
	
		//Approach 2 Kadane's Algorithm
	     int currentSum=0;
	     int maxSum=Integer.MIN_VALUE;
	     for(int i=0;i<a.length;i++) {
	    	 currentSum+=a[i];
	    	 maxSum=Math.max(currentSum, maxSum);
	    	 if(currentSum<0) {
	    		 currentSum=0;
	    	 }
	    			 
	     }
	     System.out.println(maxSum);
	}

}
