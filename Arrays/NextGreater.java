package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class NextGreater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) {
        	arr[i]=sc.nextInt();
        }
        
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean b=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    l.add(arr[j]);
                    b=true;
                    break;
                }
            }
            if(!b){
                l.add(-1);
            }
        }
        
        System.out.println(l);
	}

}
