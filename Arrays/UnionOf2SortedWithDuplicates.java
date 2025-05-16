package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class UnionOf2SortedWithDuplicates {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		int a[]=new int[size1];
		int b[]=new int[size2];
		for(int i=0;i<size1;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size2;i++) {
		   b[i]=sc.nextInt();
		}
		
		//Approach 1:Brute Force Approach
		
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<size1;i++) {
			if(!l.contains(a[i])) {
				l.add(a[i]);
			}
		}
		for(int i=0;i<size2;i++) {
			if(!l.contains(b[i])) {
				l.add(b[i]);
			}
		}
		
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i));
		}
		
		//Approach 2:In-order Traversal by using Collections(LVR principle)
		//it printed the data in sorted manner and avoid duplicates
		
		TreeSet<Integer> t=new TreeSet<>();
		for(int n:a) {
			t.add(n);
		}
		for(int n:b) {
			t.add(n);
		}
		
		//Convert to TreeSet into ArrayList by using ArrayList(collection c) Constructor
		ArrayList<Integer> l2=new ArrayList<>(t);
		for(int i=0;i<l2.size();i++) {
			System.out.print(l2.get(i));
		}
       
	}

}
