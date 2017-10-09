package assignment;

import java.util.Scanner;

public class matrixMulti 
{
	public static void main(String as[])
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the order of two matrix as a*b b*c");
		int a,b,c;
		a=scr.nextInt();
		b=scr.nextInt();
		c=scr.nextInt();
		int mat1[][]=new int[a][b];
		int mat2[][]=new int[b][c];
		int mat3[][]=new int[a][c];
		System.out.println("enter values of first matrix");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
			mat1[i][j]=scr.nextInt();	
			}
		}
		System.out.println("enter values of second matrix");
		for(int i=0;i<b;i++)
		{	for(int j=0;j<c;j++)
				{
				mat2[i][j]=scr.nextInt();	
				}
		}
		
		for(int i=0;i<a;i++)
		{for(int j=0;j<c;j++)
		{ for(int k=0;k<b;k++)
		{
			mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);
			//System.out.print(mat3[i][j]+"\t");	
		}
		}
		}
		for(int i=0;i<b;i++)
		{	for(int j=0;j<c;j++)
				{
			System.out.print(mat3[i][j]+"\t");	
				}
		System.out.println(" ");
		}
		
		
	}
}
