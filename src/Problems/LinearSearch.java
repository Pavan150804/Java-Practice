package Problems;

public class LinearSearch {
	public static void main(String[] args) {
		
	  int arr[]= {1,4,6,1,8,2};
	  int target=2;
	  int index=-1;
	  boolean flag=false;
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]==target) {
			  index=i;
			  flag=true;
			  break;
		  }
		 
	  }
	  
	  if(flag) {
			System.out.println("element found at index: "+index);
		}
	  else {
		  System.out.println("Not Found");
	  }
	}
   

}
