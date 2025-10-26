import java.util.Scanner;

public class JavaQuest2 {
  /**
   * Expected Output:
   * 
   * Example 1: Input a month number: 2 Input a year: 2016
   * 
   * February 2016 has 29 days
   * 
   * Example 2: Input a month number: 12 Input a year: 2014
   * 
   * December 2014 has 31 days
   * 
   * Example 3: Input a month number: 2 Input a year: 2100
   * 
   * February 2100 has 28 days
   * 
   * Example 4: Input a month number: 2 Input a year: 2000
   * 
   * February 2000 has 29 days
   */

  // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner scanner = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = scanner.nextInt(); // assume 1 - 12

    System.out.print("Input a year: ");
    int year = scanner.nextInt(); // > 0

    // Leap Year: The February has 29 days:
    // Every year that is exactly divisible by four is a leap year, 
    // except for years that are exactly divisible by 100, 
    // but these centurial years are leap years if they are exactly divisible by 400.
    switch (month) {
      case 1:
        number_Of_DaysInMonth = 31;
        break;
      case 2:
        if (year % 4 == 0) {
          if(year % 100 == 0){
            if(year % 400 == 0){
              number_Of_DaysInMonth = 29;
            }
            else{
              number_Of_DaysInMonth = 28;
          }
        }
        else{
          number_Of_DaysInMonth = 29;
        }
      }
      else {
        number_Of_DaysInMonth = 28;
      }
        break;
      case 3:
      number_Of_DaysInMonth = 31;
      break;
      case 4:
        number_Of_DaysInMonth = 30;
        break;
      case 5:
      number_Of_DaysInMonth = 31;
      break;
      case 6:
      number_Of_DaysInMonth = 30;
      break;
      case 7:
      number_Of_DaysInMonth = 31;
      break;
      case 8:
      number_Of_DaysInMonth = 31;
      break;
      case 9:
      number_Of_DaysInMonth = 30;
      break;
      case 10:
      number_Of_DaysInMonth = 31;
      break;
      case 11:
      number_Of_DaysInMonth = 30;
      break;
      case 12:
      number_Of_DaysInMonth = 31;
      break;
      default:
    }
    
    scanner.close();
    System.out.println(
        monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
  }

}