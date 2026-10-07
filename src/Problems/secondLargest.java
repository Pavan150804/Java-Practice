package Problems;

public class secondLargest {
	public static void main(String[] args) {
		int arr[]= {1,22,6,8,0};
		int large=Integer.MIN_VALUE;
		int small=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				third=small;
				small=large;
				large=arr[i];
			}
			else if (arr[i]>small && arr[i]!=large) {
				third=small;
				small=arr[i];
			}
			else if (arr[i]>third && arr[i]!=large  && arr[i]!=small) {
				third=arr[i];
			}
		}
		
		System.out.println("large :"+large);
		System.out.println("small :"+small);
		System.out.println("third :"+third);
	}

}
