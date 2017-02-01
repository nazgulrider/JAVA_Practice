package oops.concept.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {
	static int number;
	
	static Scanner input = new Scanner(System.in);

	static ArrayList<Integer> aL = new ArrayList<Integer>();

	public void getNumber(int number) {

		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				aL.add(i);
				number /= i;
			}
		}
	}

	public void print() {
		if (aL.size()>0) {
			System.out.print(number + "=" + aL.get(0));
			for (int a = 1; a < aL.size(); a++) {
				System.out.print("*" + aL.get(a));
			} 
		}
	}
	
	public static void main(String[] args) {
		PrimeFactors pf = new PrimeFactors();
		while (true) {
			System.out.println("Enter Your Number between 100-700");
			number = input.nextInt();
			if (number >= 100 && number <= 700) {
				pf.getNumber(number);
				pf.print();
				break;
			}
			
		}

	}

}
