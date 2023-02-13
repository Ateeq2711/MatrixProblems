package Matrix;

public class Transpose {
	public static void main(String[] args) {
		int [][]a= {{1,2,3},{5,6,9},{2,3,9}};
		int [][]b=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
