package Matrix;

public class Multiplication {
	
	public static void main(String[] args) {
		int [][]a= {{1,2,3},{5,6,9},{2,3,9}};
		int [][]b= {{7,3,9},{1,7,3},{2,3,7}};
		int [][]c=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
