//  RESULT PROCESSING
package session3;

import java.util.Scanner;

public class result {
	// specified constructor
	result(int a) {
		System.out.println("TOPPERS OF CLASS  " + a);
		// LAYOUT WITH NAME MARKS AND POSITION
		System.out.println("Name   \tmarks\tposition");
		// TOPPERS OF CLASS
		if (a == 1) {
			System.out.println("Anmol\t79.6%\t1st ");
			System.out.println("Rajat\t78.1%\t2nd");
			System.out.println("Dhruv\t77.7%\t3rd");
		}
		// TOPPER OF CLASS 2

		else if (a == 2) {
			System.out.println("Anuj\t89.6%\t1st ");
			System.out.println("Rajat\t78.1%\t2nd");
			System.out.println("Sumit\t77.7%\t3rd");
		}
		// TOPPER OF CLASS3
		else if (a == 3) {
			System.out.println("Obama\t89.6%\t1st ");
			System.out.println("Osama\t78.1%\t2nd");
			System.out.println("charlie\t77.7%\t3rd");
		}
		// TOPPER OF CLASS 4
		else if (a == 4) {
			System.out.println("daljeet\t89.6%\t1st ");
			System.out.println("Faizan \t78.1%\t2nd");
			System.out.println("Ajmer  \t77.7%\t3rd");
		}
		// TOPPER OF CLASS 5
		else if (a == 5) {
			System.out.println("karan\t89.6%\t1st ");
			System.out.println("Sakshi\t78.1%\t2nd");
			System.out.println("Pavi \t77.7%\t3rd");
		}
		// TOPPER OF CLASS 6
		else if (a == 6) {
			System.out.println("Anuj\t89.6%\t1st ");
			System.out.println("Rajat\t78.1%\t2nd");
			System.out.println("Sumit\t77.7%\t3rd");
		}
		// TOPPER OF CLASS 7
		else if (a == 7) {
			System.out.println("Pavi\t89.6%\t1st ");
			System.out.println("Rajdeep\t78.1%\t2nd");
			System.out.println("Sakib\t77.7%\t3rd");
		}
		// TOPPER OF CLASS 8
		else if (a == 8) {
			System.out.println("Shivani\t89.6%\t1st ");
			System.out.println("Harp\t78.1%\t2nd");
			System.out.println("Sidd\t77.7%\t3rd");
		}
		// TOPPER OF CLASS 9
		else if (a == 9) {
			System.out.println("Param\t89.6%\t1st ");
			System.out.println("Mani\t78.1%\t2nd");
			System.out.println("amnin\t77.7%\t3rd");
		}
		// TOPPER CLASS 10
		else if (a == 10) {
			System.out.println("anu\t89.6%\t1st ");
			System.out.println("Shahid\t78.1%\t2nd");
			System.out.println("Mushi\t77.7%\t3rd");
		} else {
			System.out.println("supplied wrong input");
		}

	}

	public static void main(String[] args) {
		int a;
		// TAKING TOP 3 RESULT OF CLASS 1 TO 10
		System.out.println("enter class between 1 to 10");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		result o = new result(a);
		obj.close();

	}

}