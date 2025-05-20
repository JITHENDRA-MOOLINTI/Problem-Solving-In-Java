package Arrays;

import java.util.Scanner;

public class Segregate0sAnd1s {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int ar[]=new int[size];
        for(int i=0;i<size;i++) {
        	arr[i]=sc.nextInt();
        	ar[i]=arr[i];
        }
        
        
        //Approach 1:
        int a[]=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]==0){
                 a[index++]=0;
             }
        }
        
        for(int i=index;i<arr.length;i++){
            a[i]=1;
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=a[i];
        }
        for(int n:arr) {
        	System.out.print(n+" ");
        }
        
        System.out.println();
        
        //Approach 2:
         int index1=0;
         for(int i=0;i<ar.length;i++) {
        	 if(ar[i]==0) {
        		 int temp=ar[i];
        		 ar[i]=ar[index1];
        		 ar[index1]=temp;
        		 index1++;
        	 }
         }
         
         for(int n:ar) {
        	 System.out.print(n+" ");
         }
	}

}
