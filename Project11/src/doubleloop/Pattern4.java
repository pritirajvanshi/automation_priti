package doubleloop;

import java.util.Scanner;

public class Pattern4 
{
	public static void main(String[] args) 
	{ 
		System.out.println("Enter any value to set the number of lines for any pattern");
		Scanner sca=new Scanner(System.in);
		int n=sca.nextInt();
		int i,j;
		int b=0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{	b=b+1;
				System.out.print(b+" ");
			}
		System.out.println();	
		}
	}	

}
