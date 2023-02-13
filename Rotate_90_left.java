package Matrix;

public class Rotate_90_left {
	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		//given array
		System.out.println("Given array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//transpose
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				int num=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=num;
			}
		}
		
		//reverse column wise
		
		for(int i=0;i<arr.length/2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int num=arr[i][j];
				arr[i][j]=arr[arr.length-1-i][j];
				arr[arr.length-1-i][j]=num;
				
			}
		}
		
		//print 
		System.out.println("90 degree left rotate");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
