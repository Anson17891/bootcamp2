import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Pratice12 {

//Write a Java program that defines a method called isPrime(int number) which returns true if the number is a prime number, and false otherwise.
//Then, in the main method:
//Create an array of integers.
//Use a loop to check each number using the isPrime method.
//Print only the prime numbers from the array.
//int[] numbers = {3, 4, 7, 10, 13, 16, 19};
//solution
public static boolean isPrime(int number){
        if(number <= 0){
            return false;
        }
        for (int i = 2 ; i < number; i++){    //! 
                if(number % i == 0){
                    return false;
                }
        }return true;
        }
    



//Write a Java program that defines a method called reverseString(String input) which returns the reversed version of the input string.
// In the main method:
// Ask the user to enter a string.
// Call the reverseString method.
// Print the reversed string.
// Enter a string: hello 
// Reversed string: olleh

public static String reverseString (){
     Scanner s = new Scanner(System.in);
     System.out.print("Enter a string: ");
     String input = s.nextLine();
     
     char tempChar = ' ';  //Be careful of what primitives should be used
     char[] arrInput = input.toCharArray();
     for(int i = 0; i < arrInput.length / 2; i++){ //Swapping
         tempChar = arrInput[i];
         arrInput[i] = arrInput[arrInput.length-i-1];
         arrInput[arrInput.length-i-1] = tempChar;
     }
     String result = "Reversed string: " + new String(arrInput);  //use new String instead of Arrays.toString
     return result;
 }  
 
 

//Write a Java program that calculates the compound interest using BigDecimal for high-precision financial calculations.
//public static BigDecimal calculateCompoundInterest(BigDecimal principal, BigDecimal rate, int years, int timesCompoundedPerYear)
//Prompt the user to enter the principal, annual interest rate (as a percentage), number of years, and //number of times interest is compounded per year.
//Call the calculateCompoundInterest method.
//Print the final amount with 2 decimal places.

    
    public static BigDecimal calculateCompoundInterest(BigDecimal principal, BigDecimal rate, int years, int timesCompoundedPerYear) {

BigDecimal percentage = rate.divide(BigDecimal.valueOf(100),5,RoundingMode.HALF_UP);
int power = timesCompoundedPerYear*years;
BigDecimal interest1 = percentage.divide(BigDecimal.valueOf(timesCompoundedPerYear),5,RoundingMode.HALF_UP);
BigDecimal interest2 = BigDecimal.ONE.add(interest1);
BigDecimal interest3 = interest2.pow(power); //.pow() only for int
BigDecimal finalAmount = principal.multiply(interest3);

 return finalAmount.setScale(2, RoundingMode.HALF_UP); //Print the final amount with 2 decimal places.
 }
    
     public static void main(String[] args) {
        int[] numbers = {3, 4, 7, 10, 13, 16, 19};
        System.out.print("Prime numbers in the array: ");
        for(int number : numbers){
            if(isPrime(number)){
                System.out.print(number+" ");
            }
        }

        System.out.println(reverseString());


        BigDecimal principal = BigDecimal.valueOf(10000);
        BigDecimal rate = BigDecimal.valueOf(5); // 5%
        int years = 10;
        int timesCompoundedPerYear = 12;

        BigDecimal result = calculateCompoundInterest(principal, rate, years, timesCompoundedPerYear);
        System.out.println("Final amount after " + years + " years: " + result);  //can also use scanner
    }

    }




