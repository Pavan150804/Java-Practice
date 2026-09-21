package Problems;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {1,4,6,1,8,2};
		Arrays.sort(arr);
		int target=1;
		
		int start=0;
		int end=arr.length-1;
//		int mid=start+end/2;
//		System.out.println(arr[mid]);
//		System.out.println(mid);
		
//		boolean status=false;
//		while(start<=end) {
//			
//			int mid=(start+end)/2;
//			
//			if(arr[mid]==target) {
//				status=true;
//			
//				break;
//			}
//			
//			else if(arr[mid]<target) {
//				start=mid+1;	
//				
//			}
//			
//			else {
//				end=mid-1;
//			
//			}
//		}
//		
//		if(status) {
//			System.out.println("Found");
//		}
//		else {
//			System.out.println("Not Found");
//		}
		
		
		 int index = -1;   

	        while (start <= end) {

	            int mid = start + (end - start) / 2;

	            if (arr[mid] == target) {
	                index = mid;     
	                break;
	            } else if (arr[mid] < target) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }

	        if (index != -1) {
	            System.out.println("Found");
	            System.out.println("Index: " + index);
	        } else {
	            System.out.println("Not Found");
	        }
		
	}

}
