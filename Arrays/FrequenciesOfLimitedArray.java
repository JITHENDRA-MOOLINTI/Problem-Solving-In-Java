package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequenciesOfLimitedArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		boolean b[]=new boolean[a.length];
        int arr[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==a[i]&&b[j]==false){
                    b[j]=true;
                    count++;
                }
            }
            if(count>0){
               arr[a[i]-1]=count;
            }
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int n:arr) {
        	l.add(n);
        }
        System.out.println(l);
        
        
        HashMap<Integer,Integer>   map=new HashMap<>();
        int freq[]=new int[a.length];
        for(int n:a) {
        	map.put(n,map.getOrDefault(n, 0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
        	freq[entry.getKey()-1]=entry.getValue();
        }
      
         for(int n:freq) {
        	 System.out.println(n);
         }
	}

}
