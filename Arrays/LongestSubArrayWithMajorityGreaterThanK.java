package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithMajorityGreaterThanK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int a[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//Approach - 1:BruteForce Approach
		int k=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>k) {
				a[i]=1;
			}else {
				a[i]=-1;
			}
		}
		
		
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			int count=0;
			for(int j=i;j<arr.length;j++) {
				sum+=a[j];
				count++;
				if(sum>0&&count>max)
				{
					max=count;
					
				}
			}
		}
		
		System.out.println(max);
		
		//Approach 2:Optimized using Prefix Sum + HashMap
		int sum=0;
		int maxLength=0;
		HashMap<Integer,Integer> m=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			sum+=a[i];
			if(sum>0) {
				maxLength=i+1;
			}
			else {
				if(!m.containsKey(sum)) {
					m.put(sum, i);
				}
				if(m.containsKey(sum-1)){
					int prevIndex=m.get(sum-1);
					maxLength=Math.max(maxLength, i-prevIndex);
				}
			}
			
		}
		System.out.println(maxLength);
	}
	

}
