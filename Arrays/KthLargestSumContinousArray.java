package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestSumContinousArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		//3 2 1-6,5,3,3,2,1
		//-9 -1 -2 -3 1
		 
		//Approach 1: Brute Force 
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				l.add(sum);
			
			}
		}
		Collections.sort(l);
		System.out.println(l.get(l.size()-k));
		
		
		//Approach 2:
		
		PriorityQueue<Integer> p = new PriorityQueue<>();
		for(int i=arr.length-1;i>=0;i--) {
			int sum=0;
			for(int j=i;j>=0;j--) {
				sum+=arr[j];
				if(p.size()<k) {
					p.offer(sum);
				}
				else if(sum>p.peek()) {
					p.poll();
					p.offer(sum);
				}
			}
		}
		System.out.println(p.peek());
	}

}
