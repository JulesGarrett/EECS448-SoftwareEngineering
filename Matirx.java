//Julia Garrett
//Last Work on: 3/26/17
//Matirx calculation files
package eecs448_lab7;

import java.lang.Math;


public class Matirx {
static int MaxSize=10;
static int n;
static int[][] mdata=new int[MaxSize][MaxSize]; 
	
	public static void main(String[] args) {
		

	}
	public static double determinant(){
		double det=0.0;
		if(n==1){
			det=mdata[0][0];
		}
		else if(n==2){
			det = mdata[0][0] * mdata[1][1] - mdata[0][1] * mdata[1][0];
		}
		else{
			for(int i=0; i<n; ++i){
				det += Math.pow(-1.0, (double)i) * mdata[0][i]* subMatrix(0, i).determinant();
			}
		}
		return det;
	}
	public static Matirx subMatrix(int r, int c){
		
		Matirx sub = null;
		
		return sub;
	}

}
