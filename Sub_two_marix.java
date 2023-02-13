package Matrix;

public class Sub_two_marix {
	public static void main(String[] args) {
	
		int [][]arr1= {{1,2,3},{4,5,6},{9,6,3}};
		int [][]arr2= {{6,2,2},{7,5,8},{9,2,3}};
		int [][]arr3=new int[3][3];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr3[i][j]=arr1[i][j]-arr2[i][j];
				System.out.print(arr3[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}
	
	

}
