package com.worksheet.workout;
//example 19. Write a program to add two matrices.

public class Matrixaddition {
	
		public static void main (String[] args){
			int [][] matrix1 = new int [2][2];
			matrix1 [0][0] = 1;
			matrix1 [0][1] =4;
			matrix1 [1][0] =5;
			matrix1 [1][1] =6;
			int [][] matrix2 = new int [2][2];
			matrix2 [0][0] = 3;
			matrix2 [0][1] =6;
			matrix2 [1][0] =9;
			matrix2 [1][1] =12;
			int [][] sum =new int [2][2];
			for (int i=0;i<matrix1.length; i++){
				for (int j=0; j<matrix1[0].length;j++){
					sum [i][j]= matrix1 [i][j]+matrix2 [i][j];
					System.out.print(sum[i][j]+" ");
				}
						System.out.println();
					}
					
					
		}
}

		
	


