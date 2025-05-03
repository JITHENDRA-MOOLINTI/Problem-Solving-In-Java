package problems;

import java.util.Scanner;

public class BitCoin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
	    int max=0;
	    int start=0;
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]>=max) {
	    		start=i;
	    		max=a[i];
	    		
	    	}else {
	    		break;
	    	}
	    }
	   if(start!=0) {
		   System.out.println(max);
	   }else {
		   System.out.println(a[0]);
	   }
	}

}
