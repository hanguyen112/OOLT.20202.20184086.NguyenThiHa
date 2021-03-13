import java.util.Scanner;

public class DaysofAMonth {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		String month = sc.nextLine();
		switch(month) {
		// Các tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày.
		case "1": case "January": case "Jan": case "Jan.":
		case "3": case "March": case "Mar": case "Mar.":
		case "5": case "May": case "May.":
		case "7": case "July":
		case "8": case "August": case "Aug":
		case "10": case "October": case "Oct": case "Oct.":
		case "12": case "December": case "Dec": case "Dec.":
			System.out.println(month + " has 31 days.");
			break;
		
		// Các tháng 4, 6, 9, 11 có 30 ngày
		case "4": case "April": case "Apr": case "Apr.":
		case "6": case "June": case "Jun": case "Jun.":
		case "9": case "September": case "Sep": case "Sep.":
		case "11": case "November": case "Nov": case "Nov.":
			System.out.println(month+ " has 30 days");
			break;
		// Tháng 2 năm nhuận có 29 ngày, nếu không thì có 28 ngày
		case "2": case "Febuary": case "Feb": case "Feb.":
			System.out.println("Enter the year: ");
			int year = sc.nextInt();
			if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)) {
				System.out.println(month+" " +year+" has 29 days");
			}
				else {
				System.out.println(month +" "+ year+ " has 28 days");
				}
				break;
				default:
					System.out.println("Invalid month !!! Please re-enter ");
			}
		}
}

