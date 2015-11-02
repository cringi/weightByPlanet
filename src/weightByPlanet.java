/**
 * Author: Brandon B.
 * Date: 11-2-15
 */

import java.util.Scanner;
public class weightByPlanet {
    public static void main(String[] args) {
    	int planet;
    	double weight;

    	String[] planetList = new String[4];
    	double[] planetWeights = new double[4];

    	planetList[0] = "Mars";
    	planetList[1] = "Venus";
    	planetList[2] = "Jupiter";
    	planetList[3] = "Pluto";

    	planetWeights[0] = 0.38;
    	planetWeights[1] = 0.9;
    	planetWeights[2] = 2.36;
    	planetWeights[3] = 0.07;

    	Scanner kbReader = new Scanner(System.in);

    	System.out.print("How much do you weigh [on Earth]? ");
    	weight = kbReader.nextDouble();

    	System.out.println("\nSelect a planet.");

    	for(int count = 0;count < planetWeights.length;count++) {
    		System.out.printf("%n%d. %s", count + 1, planetList[count]);
    	}

    	System.out.print("\n> ");
    	planet = kbReader.nextInt();

    	switch(planet) {
    		case 1:
    			System.out.printf("%nYour weight on %s is ~%.2flbs.%n", planetList[0], weight * planetWeights[0]);
    			break;
    		case 2:
    			System.out.printf("%nYour weight on %s is ~%.2flbs.%n", planetList[1], weight * planetWeights[1]);
    			break;
    		case 3:
    			System.out.printf("%nYour weight on %s is ~%.2flbs.%n", planetList[2], weight * planetWeights[2]);
    			break;
    		case 4:
    			System.out.printf("%nYour weight on %s is ~%.2flbs.%n", planetList[3], weight * planetWeights[3]);
    			break;
    		default:
    			System.out.println("You didn't select a valid planet :-(");
    	}
    }
}
