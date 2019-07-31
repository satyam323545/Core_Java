package remaining.programs;

import java.util.Scanner;

public class three_matrix_sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1=new int[3][3];
		int[][] arr2=new int[3][3];
		int[][] arr_sum=new int[3][3];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr1[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr2[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr_sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr_sum[i][j]+"\t");
			}
			System.out.println("");
		}

	}

}
