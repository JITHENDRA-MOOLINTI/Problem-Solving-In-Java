package com.math;

import java.util.Scanner;

public class LookAndSayPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String result="1";
		String result1="1";
		//Approach 1:
		for(int i=1;i<n;i++) {
			int count=1;
			String next_result="";
			for(int j=1;j<result.length();j++) {
				if(result.charAt(j)==result.charAt(j-1)) {
					count++;
				}
				else {
					next_result+=count+""+result.charAt(j-1);
					count=1;
				}
				
			}
			next_result+=count+""+result.charAt(result.length()-1);
			result=next_result;
			
		}
		System.out.println(result);
		
		//Approach 2:
		for(int i=1;i<n;i++) {
			int count=1;
			StringBuilder sb=new StringBuilder();
			for(int j=1;j<result1.length();j++) {
				if(result1.charAt(j)==result1.charAt(j-1)) {
					count++;
				}
				else {
					sb.append(count).append(result1.charAt(j-1));
					count=1;
				}
				
			}
			sb.append(count).append(result1.charAt(result1.length()-1));
			result1=sb.toString();
			
		}
		System.out.println(result1);
	}

}
