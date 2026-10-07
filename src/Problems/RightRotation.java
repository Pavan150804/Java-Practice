package Problems;

import java.util.Arrays;

public class RightRotation {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
	   int k=2;
	   for(int i=0;i<k;i++) {
		   for(int j=arr.length-1;j>0;j--) {
			   int temp=arr[j];
			   arr[j]=arr[j-1];
			   arr[j-1]=temp;
		   }
	   }
	   System.out.println(Arrays.toString(arr));
	}

}
