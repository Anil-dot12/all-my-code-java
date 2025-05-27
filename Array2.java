public class Array2 {
     public static void main(String[] args) {
		int[][] arr= {{1,2,3,4,5},{9,10,11,12}};
		
		System.out.println("print the number:");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
			}
		}
     }
