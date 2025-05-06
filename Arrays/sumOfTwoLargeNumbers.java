package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfTwoLargeNumbers {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		//Approach-1
//		int max=Math.max(s1.length(), s2.length());
//		int a[]=new int[max+1];
//		int m=a.length-1;
//		int carry=0;
//		if(s1.length()>=s2.length()) {
//			int k=s2.length()-1;
//			for(int i=s1.length()-1;i>=0;i--) {
//				int sum=0;
//				if(k>=0) {
//					sum=(s1.charAt(i)-'0'+s2.charAt(k--)-'0')+carry;
//				}
//				else {
//					sum=s1.charAt(i)-'0'+carry;
//				}
//				
//				a[m--]=sum%10;
//				carry=sum/10;
//			}
//			if(carry!=0) {
//				a[m]=carry;
//			}
//		}
//		else {
//			int k=s1.length()-1;
//			for(int i=s2.length()-1;i>=0;i--) {
//				int sum=0;
//				if(k>=0) {
//					sum=(s2.charAt(i)-'0'+s1.charAt(k--)-'0')+carry;
//				}
//				else {
//					sum=s2.charAt(i)-'0'+carry;
//				}
//				a[m--]=sum%10;
//				carry=sum/10;
//			}
//			if(carry!=0) {
//				a[m]=carry;
//			}
//		}
//		
//		StringBuilder sb=new StringBuilder();
//		for(int num:a) {
//			sb.append(num);
//		}
//		if(sb.toString().replaceFirst("^0+", "").isEmpty()) {
//			System.out.println("0");
//		}
//		else {
//			System.out.println(sb.toString().replaceFirst("^0+", ""));
//		}
		
		//Approach -2
		
		StringBuilder sb=new StringBuilder();
		int carry=0;
		int i=s1.length()-1;
		int j=s2.length()-1;
		while(i>=0||j>=0||carry>0) {
			int digit1=i>=0?(s1.charAt(i--)-'0'):0;
			int digit2=j>=0?(s2.charAt(j--)-'0'):0;
			int sum=digit1+digit2+carry;
			sb.append(sum%10);
			carry=sum/10;
		}
		String result=sb.reverse().toString().replaceFirst("^0+", "");
		if(result.isEmpty()) {
			System.out.println("0");
		}
		else {
			System.out.println(result);
		}
	}

}
