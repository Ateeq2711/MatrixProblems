package Matrix;

public class Largest_element_row_wise {
	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{9,6,3}};
		for(int i=0;i<arr.length;i++) {
			
			int big=arr[i][0];
			for(int j=0;j<arr[i].length;j++) {
				if(big<arr[i][j]) {
					big=arr[i][j];
				}
				
			}
			System.out.println("Biggest element of "+(i+1)+" row is "+big);
	}

}
	}

