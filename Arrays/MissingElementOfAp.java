package Arrays;

import java.util.Scanner;

//1 6 11 16 21 31
public class MissingElementOfAp {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<arr.length;i++) {
		   arr[i]=sc.nextInt();
	   }
	   
	   //Approach -1 linear Search
	   int diff=arr[1]-arr[0];
	   boolean isPresent=false;
	   for(int i=1;i<arr.length;i++) {
		   if(((arr[i]-arr[i-1])!=diff)&&(isPresent==false)){
			  
			   System.out.println(arr[i-1]+diff);
			   isPresent=true;
			   break;
		   }
	   }
	   if(!isPresent) {
		   System.out.println(arr[arr.length-1]+diff);
		  
	   }
	   
	  
	 //Approach  2 Binary Search
	    int low=0;
	    int high=arr.length-1;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(arr[mid]-arr[0]!=mid*diff){
	            high=mid-1;
	        }
	        else{
	            low=mid+1;
	        }
	    }
	    System.out.println(arr[0]+low*diff);
	}

}
