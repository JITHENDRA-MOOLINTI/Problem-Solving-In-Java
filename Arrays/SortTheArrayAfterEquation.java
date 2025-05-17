package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//AX2+BX+C
public class SortTheArrayAfterEquation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		//Approach 1:
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			l.add((A*(arr[i]*arr[i]))+(B*arr[i])+(C));
		}
		
	   Collections.sort(l);
	   for(int n:l) {
		   System.out.print(n+" ");
	   }
	   
	   //Approach 2:
	   ArrayList<Integer> l1=new ArrayList<>();
	   PriorityQueue<Integer> p=new PriorityQueue<>();
	   for(int n:arr) {
		   p.add((A*(n*n))+(B*n)+C);
	   }
	   while(!p.isEmpty()) {
		   l1.add(p.poll());
	   }
	   for(int n:l1) {
		   System.out.print(n+" ");
	   }
	}

}
