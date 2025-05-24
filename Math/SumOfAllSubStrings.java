package Arrays;

import java.util.Scanner;

public class SumOfAllSubStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		
		
		//Approach 1:
		int sum=0;
		for(int i=0;i<s.length();i++) {
			int num=0;
			for(int j=i;j<s.length();j++) {
				num=(num*10)+(s.charAt(j)-'0');
				sum+=num;
			}
		}
        
		System.out.println(sum);
		
		long sum1=0;
		long prev=0;
		long curr=0;
		for(int i=0;i<s.length();i++) {
		int d=(s.charAt(i)-'0');
		   curr=prev*10+d*(i+1);
		   sum1+=curr;
		   prev=curr;
		}
		System.out.println(sum1);
	}

}
