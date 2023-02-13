package Matrix;

public class Add_two_matrix {
	
	public static void main(String[] args) {
		int [][]a= {{7,8,5},{1,5,6},{6,3,7}};
		int [][]b= {{2,1,3},{8,3,6},{3,6,7}};
		int[][]c=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

		
	

}
