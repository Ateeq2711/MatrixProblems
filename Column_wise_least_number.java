package Matrix;

public class Column_wise_least_number {
	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{9,6,3}};
	
		for(int i=0;i<arr[0].length;i++) {//column size
			
			int leastNum=arr[i][0];
			for(int j=0;j<arr.length;j++) {//row size
				if(leastNum>arr[i][j]) {
					leastNum=arr[i][j];
				}
			}
			System.out.println("The least number in "+(i+1)+" is : "+leastNum);
		}
	
	
	}
	
}
