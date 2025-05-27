import java.util.Arrays;
public class SortingAndSearching {
	
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

// Insertion Sort
public static void insertionSort(int[] arr){
	 for (int i = 1; i < arr.length; i++) { 
		 int tmp = arr[i];
		 for (int j = i ; j > 0 && tmp < arr[j-1]; j--) {
			 arr[j] = arr[j-1];
			 arr[j-1] = tmp;
		 }}}

public static void  swap(int[] a, int e1, int e2) {
int tmp = a[e1]; 
a[e1] = a[e2];
a[e2] = tmp;
}

// Sequential Search
   public static int sequentialSearch(int[] arr, int target){
	   
	        for  ( int i = 0; i < arr.length;i++) { 
	        	if( arr[i]  == target) {
	                return i;}}
	        return -1;}

// Binary Search
public static int binarySearch(int[] arr, int target){
    int low = 0;
    int high = arr. length -  1;
    while ( low <= high)  {
        int mid = low + ( high -  low)  /  2;
        if  ( arr[ mid]  == target) {
            return mid;}
        else if ( arr[ mid]  < target) {
            low = mid + 1;
            }else { high = mid -  1;}}
    return - 1;}
        

public static void main(String[] args) {
	
int[] elements = {10, 5, 2, 17, 7, 6, 1, 20, 3, 9, 4, 12, 8};
bubbleSort(elements);

System.out.println("Bubble Sort: " + Arrays.toString(elements));
selectionSort(elements);
System.out.println();

System.out.println("Selection Sort: " + Arrays.toString(elements));
insertionSort(elements);
System.out.println();

System.out.println("Insertion Sort: " + Arrays.toString(elements));
System.out.println();

// Searching for element 
 int elementToSearch = 9;
 
        int sequentialIndex = sequentialSearch(elements, elementToSearch);  
           if (sequentialIndex != -1) {
               System.out.println("Sequential Search: Element found at index " + sequentialIndex);
                  } else { 
                	  System.out.println("Sequential  Search:  Element  not  found.");}

     int binaryIndex = binarySearch(elements, elementToSearch); 
      if (binaryIndex != -1) {
         System.out.println("Binary Search: Element found at index " + binaryIndex);
        } else {
            System.out.println("Binary  Search:  Element  not found.");}
     }}
