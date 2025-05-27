import java.util.Arrays;
public class Sorting {
	
	// Bubble Sort
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=arr.length-1;j>i;--j) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}}}}
	
	// Selection Sort
	public static void selectionSort(int[] arr){
		 int i,j,least; 
		 for (i = 0; i < arr.length-1; i++) {  
			 for (j = i+1, least = i; j < arr.length; j++) {
				 if(arr[j]<arr[least]) {
					 least=j;	 
				 }
				 if(i!=least) {
					 swap(arr,least,i); 
			  }}}}
	
	public static void  swap(int[] a, int e1, int e2) {
		int tmp = a[e1]; 
		a[e1] = a[e2];
		a[e2] = tmp;
		}
	
	public static void main(String[] args) {
		
		int[] elements = {1, 5, 2, 3, 7, 16, 0, 20, 18, 5, 12 ,21};
		
		
		bubbleSort(elements);
		System.out.println("Bubble Sort: " + Arrays.toString(elements));
		
		selectionSort(elements);
		System.out.println();
		System.out.println("Selection Sort: " + Arrays.toString(elements));
		}}
