package Arrays;

import java.util.Scanner;

public class FindIndex {
	
	static int[] findIndex(int arr[], int key) {
		
    int a[]=new int[2];
    boolean firstTime=false;
    boolean secondTime=false;
    for(int i=0;i<arr.length;i++) {
    	 if(arr[i]==key&&!firstTime) {
    		 a[0]=i;
    		 firstTime=true;
    		 secondTime=true;
    	 }
    	 if(arr[i]==key&&secondTime) {
    		 a[1]=i;	 
    	 }
    }
    if(!firstTime&&!secondTime) {
    	a[0]=-1;
    	a[1]=-1;
    }
    return a;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int size=sc.nextInt();	
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
		}
		int result[]=findIndex(arr,k);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
   }
}		

	


