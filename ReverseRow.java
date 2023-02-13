package Matrix;

public class ReverseRow {
	public static void main(String[] args) {
int [][]arr= {{1,2,3},{4,5,6},{9,6,3}};
		
		System.out.println("given array is");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		 
		System.out.println("array after reversing column wise");
			
			
		for(int i=0;i<arr.length/2;i++){
			for(int j=0;j<arr[i].length;j++) {
				int num=arr[i][j];
				arr[i][j]=arr[arr[i].length-1-i][j];
				arr[arr[i].length-i-1][j]=num;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
