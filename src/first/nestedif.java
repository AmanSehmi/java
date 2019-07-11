package first;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		// Nested If

		 Scanner i = new Scanner(System.in); 
		int g =i.nextInt();
		 if(g>90 && g<=100)
		{
			System.out.print("Grade is A+");
		}
		else if(g>80 && g<=90)
		{
			System.out.print("Grade is A");				

		}
		else if(g>70 && g<=80)
		{
			System.out.print("Grade is B");				

		}
		else if(g>=60 && g<=70)
		{
			System.out.print("Grade is C");				

		}
		else if(g<60 && g>=0)
		{
			System.out.print("Fail");				

		}
		else
		{
			System.out.print("Invalid Entry");				

		}
	}

}
