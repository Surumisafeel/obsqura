package com.training.examples;

public class TwoDimentionalArray {
	public static void main (String[] args){
		int [][] values = new int [2][2];
				values [0][0] = 1;
				values [0][1] =4;
				values [1][0] =5;
				values [1][1] =6;
				System.out.println("Row length is " + values.length);
				System.out.println("column length is " + values[0].length);
				for (int i=0;i<values.length; i++){
					for (int j=0; j<values[0].length;j++){
						System.out.print(values[i] [j]);
					}
					System.out.println();
				}
				
				
	}

}
