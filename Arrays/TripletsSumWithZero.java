package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TripletsSumWithZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
        //Approach 1:Brute Force Approach
		boolean isPresent=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println(true);
						isPresent=true;
						break;
					}
				}
			}
			if(isPresent) {
				break;
			}
		}
		if(!isPresent) {
			System.out.println(false);
		}
		
		Arrays.sort(arr);
		boolean isExists=false;
		for(int i=0;i<arr.length-2;i++) {
			int left=i+1;
			int right=arr.length-1;
			while(left<=right) {
				int sum=arr[i]+arr[left]+arr[right];
				if(sum==0) {
					  System.out.println(true);
					  isExists=true;
					  break;
				}
				else if(sum<0) {
					left+=1;
				}
				else {
					right-=right;
				}
			}
			if(isExists) {
				break;
			}
		}
		if(!isExists) {
			System.out.println(false);
		}
	}

}
