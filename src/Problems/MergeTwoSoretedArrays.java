package Problems;

import java.util.Arrays;

public class MergeTwoSoretedArrays {
	
	public static void main(String[] args) {
		int a[]= {3,2,4,5};
		int b[]= {1,6,8,7,9};
		   Arrays.sort(a);
	       Arrays.sort(b);
		
		int c[]=new int [a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];
			}
			else {
				c[k++]=b[j++];
			}
		}
		
		while(i<a.length) {
			c[k++]=a[i++];	
		}
		while(j<b.length) {
			c[k++]=b[j++];
			
		}
		System.out.print(Arrays.toString(c));
	
	}

}
