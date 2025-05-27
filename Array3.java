public class Array3 {
	public static void main(String[] args) {
		int [] arr= new int[10];
		arr [0]=1;
	    arr [1]=2;
	    arr [2]=4;
	    arr [3]=5;
		int c=10;
		int size =4;
		int v= 3;
		int p=2;
		
        System.out.println("the array:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
		size =insertAtpos(arr,size,p,v,c);
		System.out.println(" ");
		System.out.println("after insert:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}}
	public static int insertAtpos(int[]a,int size,int p,int v,int c) {
	if (size==c) { 
	return size;
	}else {
	for (int i=size;i>p;i--) 
	  a[i]=a[i-1];
	a[p]=v;	
	return (size+1);}
	}}//end class

