package Problems;

import java.util.Arrays;

public class LeftRotation {
	
     public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int k=2;
		for(int j=0;j<k;j++) {
			for (int i=0;i<arr.length-1;i++) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		
	  System.out.println(Arrays.toString(arr));
	}
}
