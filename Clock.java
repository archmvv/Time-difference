/** This program calculates the time difference between two hours
 */

import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the first time(military format - 0900 1300 ets): ");
		int first = in.nextInt();
		System.out.print("Please enter the second time(military format - 0900 1330 ets): ");
		int second = in.nextInt();
		
		final int MINUTES_IN_AN_HOUR = 60;
		final int HOURS_IN_A_DAY = 24;
		
		int firstHour = first / 100;
		int firstMinutes = first % 100;
		int secondHour = second / 100;
		int secondMinutes = second % 100;
		int hourDifference = 0;
		int minutesDifference = 0;
		
		if(firstMinutes > 59 || secondMinutes > 59) {
			System.out.println("Please enter correct time format.");
		}
		else if(second > first && secondMinutes >= firstMinutes) {
			hourDifference = secondHour - firstHour;
			minutesDifference = secondMinutes - firstMinutes;
		}
		else if(second > first && firstMinutes > secondMinutes) {
			hourDifference = secondHour - firstHour - 1;
			minutesDifference = MINUTES_IN_AN_HOUR - firstMinutes + secondMinutes;
		}
		else if(first > second && secondMinutes >= firstMinutes) {	
			hourDifference = (HOURS_IN_A_DAY - firstHour) + secondHour;
			minutesDifference = secondMinutes - firstMinutes;
		}
		else if(first > second && firstMinutes > secondMinutes) {	
			hourDifference = (HOURS_IN_A_DAY - firstHour) + secondHour - 1;
			minutesDifference = MINUTES_IN_AN_HOUR - firstMinutes + secondMinutes;
		}
		
		System.out.printf("The time difference is: %d hours %d minutes", hourDifference, minutesDifference);
	}

}
