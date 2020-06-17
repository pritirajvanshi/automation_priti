package doubleloop;

import java.util.Scanner;

public class Pattern3 
{
	public static void main(String[] args) 
	{ 
		System.out.println("Enter any value to set the number of lines for any pattern");
		Scanner sca=new Scanner(System.in);
		int n=sca.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
		System.out.println();	
		}
	}
}
