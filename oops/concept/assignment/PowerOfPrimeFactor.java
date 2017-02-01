package oops.concept.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PowerOfPrimeFactor extends PrimeFactors {

	public void countFrequency() {

		HashSet<Integer> unique = new HashSet<Integer>(aL);
		ArrayList<Integer> sortedAL = new ArrayList<Integer>(unique);

		System.out.print(number + "=" + sortedAL.get(0) + "^" + Collections.frequency(aL, sortedAL.get(0)));
		for (int a = 1; a < unique.size(); a++) {
			System.out.print("*" + sortedAL.get(a) + "^" + Collections.frequency(aL, sortedAL.get(a)));

		}

	}

	public static void main(String[] args) {
		PowerOfPrimeFactor po = new PowerOfPrimeFactor();
		PrimeFactors pf = new PrimeFactors();
		while (true) {
			System.out.println("Enter Your Number between 100-700");
			number = input.nextInt();
			if (number >= 100 && number <= 700) {
				pf.getNumber(number);
				break;
			}

		}

		po.countFrequency();

	}

}
