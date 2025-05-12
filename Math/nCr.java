package Arrays;

import java.util.Scanner;

public class nCr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		if(r>n) {
			System.out.println(0);
		}
		else if(n==r||r==0) {
			System.out.println(1);
		}
		// n=21 r=16 20349
		else {
			if(r>n-r) {
				r=n-r;
			}
			long ans=1;
			for(int i=1;i<=r;i++) {
				ans*=n--;
				ans/=i;
			}
			System.out.println((int)ans);
		}
	}

}
