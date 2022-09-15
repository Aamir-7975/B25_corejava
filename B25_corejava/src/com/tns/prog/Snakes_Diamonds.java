//Program that checks for snakes or diamonds in the tunnels:

package com.tns.prog;

import java.util.Scanner;

public class Snakes_Diamonds
{

	public static void main(String[]args)

	{

		Scanner inp = new Scanner(System.in);

		for(int tunnel = 1; tunnel <= 7; tunnel++)

		{

			System.out.println("Entering tunnel " + tunnel);

			System.out.println("Are there snakes here? Enter only true or false");

			boolean areSnakes = inp.nextBoolean();

			//check for snakes

			if (areSnakes) // if true is entered by the user

			{System.out.println(); //leave a line for better readability in output

			continue; // skip the remaining lines of code

			}

			//check for diamonds

			System.out.println("Are there diamonds here? Enter only true or false");

			boolean areDiamonds = inp.nextBoolean();

			if (areDiamonds) // if true is entered by the user

			{

				System.out.println("I found diamonds in tunnel " + tunnel);

				break;

			}

			System.out.println(); // add a line for better readability

		}

	}

}
