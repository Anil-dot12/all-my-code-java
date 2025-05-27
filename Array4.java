public class Array4 {
	public static void main(String[] args) {
		int [] arr= new int[10];
		arr [0]=1;
	    arr [1]=2;
	    arr [2]=3;
	    arr [3]=4;
		int c=10;
		int size =4;
		int p=3;		
	   System.out.println("the array:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}	
		
		size =insertAtpos(arr,size,p);
		System.out.println(" ");
		System.out.println("after deleting:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}}
	public static int insertAtpos(int[]a,int size,int p) {
	if (size<=p) { 
	return size;
	}else {
	for (int i=p;i>size-1;i++) 
	  a[i]=a[i+1];
	return (size-1);}
	}}
