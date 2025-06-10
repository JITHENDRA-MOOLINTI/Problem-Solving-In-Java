package Arrays;

import java.util.Scanner;

public class SpirallyMatrix {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   int row=sc.nextInt();
	   int col=sc.nextInt();
		int mat[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		
		
		System.out.println("-------------------------------");
		int count=0;
		boolean b[][]=new boolean[row][col];
		int i=0;
		int j=0;
			while(count<row*col) {
				//right
				while(j<mat[0].length&&b[i][j]!=true) {
					System.out.print(mat[i][j]+" ");
					b[i][j]=true;
					j++;
					count++;
				}
				
				//down
				i++;
				j--;
				while(i<mat.length&&b[i][j]!=true) {
					   System.out.print(mat[i][j]+" ");
					   b[i][j]=true;
					   i++;
					   count++;
				}
				
				//left
				i--;
				j--;
				while(j>=0&&b[i][j]!=true) {
					System.out.print(mat[i][j]+" ");
					b[i][j]=true;
					j--;
					count++;
				}
				//up
				j++;
				i--;
				while(i>=0&&b[i][j]!=true) {
					System.out.print(mat[i][j]+" ");
					b[i][j]=true;
					i--;
					count++;
				}
				i++;
				j++;
			}
		}
	}
	
	

