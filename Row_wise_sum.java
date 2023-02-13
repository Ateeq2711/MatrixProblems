package Matrix;

public class Row_wise_sum {
	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{9,6,3}};
		for(int i=0;i<arr.length;i++) {
			int sum =0;
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
			System.out.println("the of "+(i+1)+ " is : "+sum );
		}
	}

}
