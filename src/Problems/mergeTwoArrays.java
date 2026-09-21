package Problems;

import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {
		int arr[]= {1,2,3,5};
		int arr1[]= {6,7,8};
		
		int add[]=new int[arr.length+arr1.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			add[index++]=arr[i];
			
			
		}
		for(int i=0;i<arr1.length;i++) {
			add[index++]=arr1[i];
			
		}
		
		System.out.println(Arrays.toString(add));
	}
}
