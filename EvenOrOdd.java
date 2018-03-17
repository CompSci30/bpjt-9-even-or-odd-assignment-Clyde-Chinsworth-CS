//BPJT 9 Even or Odd Project
//17/03/2018
import java.io.*;
import java.util.*;
public class EvenOrOdd
{
	public static void main(String args[])
	{
		Scanner kbReader = new Scanner(System.in);
		System.out.print("Enter an integer");
		int num = kbReader.nextInt();
                if ((num % 2) == 0) //checks remainder of num / 2, if 0 , retur$
                	System.out.println("The integer " + num + " is even.");
                else 
                	System.out.println("The integer " + num + " is odd.");
	}
}

