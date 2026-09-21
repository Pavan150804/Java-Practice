package Problems;

import java.util.Arrays;

public class Example1 {
   public static void main(String[] args) {
	int arr[]={1,2,3,4};
	int op[]=new int[arr.length];
	
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=0;j<arr.length;j++) {
			 if(i!=j) {
				 sum+=arr[j];
			 }
		}
		
		op[i]=sum;
	}
	
	System.out.println(Arrays.toString(op));
}
}
