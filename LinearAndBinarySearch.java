public class LinearAndBinarySearch {

	public static int LinearSearch(int[] arr,int K) {
		for(int i=0;i<arr.length;i++) {
			if(K==arr[i])
				return i;}
		return -1;}
	
	public static int binarySearch(int[] list, int key) {
		  int low = 0;
		  int high = list.length - 1;
		  while (high >= low) {
		     int mid = (low + high) / 2;
		      if (key < list[mid])
		        high = mid - 1;
		      else if (key == list[mid])
		        return mid;
		     else
		         low = mid + 1;}
		      return -1 ;}
	
	public static void main(String[] args) {
		int [] A= {1,5,8,9,0,3,2,7};
		int [] A2= {6,7,8,9,10,11,12};
		
		int L1=LinearSearch(A,5);
		System.out.println("position for number 5 in the Array(by use Linear Search): "+ L1);
		int L2=LinearSearch(A,4);
		System.out.println("position for number 4 in the Array(by use Linear Search): "+ L2+" It doesn't exist");
		System.out.println();
		int L3=binarySearch(A2,10);
		System.out.println("position for number 10 in the Array1(by use Binary Search): "+ L3);
		int L4=binarySearch(A2,13);
		System.out.println("position for number 13 in the Array1(by use Binary Search): "+ L4+" It doesn't exist");
	}}
