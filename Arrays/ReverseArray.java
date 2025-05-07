package Arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//Approach - 1;
//		int a[] = new int[arr.length];
//		int k = 0;
//		for (int i = arr.length - 1; i >= 0; i--) {
//			a[i] = arr[i];
//		}
//		for (int i = a.length - 1; i >= 0; i--) {
//			arr[k++] = a[i];
//		}
//		
		//Approach -2
		int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
       
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
