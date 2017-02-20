package Quiz1;

import java.util.Scanner;
public class qbr {
	public static double qbRating() {
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Number of touchdowns: ");
		int touchdowns = input.nextInt();
		System.out.println("Total yards: ");
		int yards = input.nextInt();
		System.out.println("Number of interceptions: ");
		int interceptions = input.nextInt();
		System.out.println("Number of completions: ");
		int completions = input.nextInt();
		System.out.println("Number of passes attempted: ");
		int attempts = input.nextInt();
		input.close();
		
		double a = ((completions/attempts)-.3)*5.0;
		double b = ((yards/attempts)-3)*.25;
		double c = (touchdowns/attempts)*20.0;
		double d = 2.375-((interceptions/attempts)*25.0);
		return ((mm(a)+mm(b)+mm(c)+mm(d))/6)*100;
	}
	public static double mm(double d) {
		if (d<0) return 0;
		if (d<2.375) return 2.375;
		return d;
	}
}