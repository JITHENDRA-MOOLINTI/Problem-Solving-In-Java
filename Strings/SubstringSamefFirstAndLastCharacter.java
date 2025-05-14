package com.strings;

import java.util.Scanner;

public class SubstringSamefFirstAndLastCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		
		//Approach 1:Brute Force(large data TIME limit Exceeds)
		int count=0;
		for(int i=0;i<s.length();i++) {
			String out="";
			for(int j=i;j<s.length();j++) {
				out+=s.charAt(j);
				if(out.charAt(0)==out.charAt(out.length()-1)) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		//Approach 2:frequency
		
		int a[]=new int[26];
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)-'a']++;
		}
		
		int result=0;
		for(int f:a) {
			if(f>0) {
				result+=f*(f+1)/2;
			}
		}
		System.out.println(result);
	}

}
