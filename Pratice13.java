public class Pratice13 {
  public static void main(String[] args) {
    
    //swicth, break

    //Write a Java program that takes an integer input representing a day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday) and prints the name of the corresponding day using a switch statement. If the input is not between 1 and 7, print "Invalid day".
    //If the input is 3, the output should be:

    int weekOfDay = 3;

    switch (weekOfDay) {
        case 1:
        System.out.println("Monday");
          break;
          case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
          break;
        case 4:
        System.out.println("Thursday");
          break;
          case 5:
        System.out.println("Friday");
          break;
          case 6:
        System.out.println("Saturday");
          break;
          case 7:
        System.out.println("Sunday");
          break;
        default:
         System.out.println("Invalid day");
    }

    //judge a num if it is even number w/o using if & for
    int num = 12343423;
    String[] evenOrOdd = {"True","False"};
    System.out.println(evenOrOdd[num % 2]);
  }
  
}
