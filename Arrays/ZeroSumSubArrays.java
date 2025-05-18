package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class ZeroSumSubArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
        
		HashMap<Integer,Integer> map=new HashMap<>();
		int prefixSum=0;
		int count=0;
		for(int n:a) {
			prefixSum+=n;
			if(prefixSum==0) {
				count++;
			}
			if(map.containsKey(prefixSum)) {
				count+=map.get(prefixSum);
			}
			map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
		}
		
	   System.out.println(map);
	   System.out.println(count);
	}

}
