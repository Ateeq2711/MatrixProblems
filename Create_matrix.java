package Matrix;

import java.util.Scanner;

public class Create_matrix {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the number of Row");
		int row=scan.nextInt();
		
		System.out.println("Enter the number of column");
		int col=scan.nextInt();
		
		int [][]matrix=new int[row][col];
		 
		System.out.println("Enter the data");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=scan.nextInt();
			}
			
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
	}
	}
}
