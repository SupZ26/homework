import java.util.Scanner;
public class Exercise01
{
	public static void main(String[] args)
	{
		int i = 1;

		for(;i <=4;i++)
		{

			for(int j = 1 ; j <= 9;j++)
			{
				if((j + i) == 6 || (j - i) == 4 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}			
			}
	
			System.out.print("\n");
		}

		System.out.print("*********");

		
	}
}



 /*   *
     ***
    *****
   *******
  ********* */
/* 1 5
 2 6 
 3 7 10
 4 8 12*/
