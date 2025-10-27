import java.util.Scanner;

public class Pratice11 {
  public static void main(String[] args) {
    //for each
    int[] numbers1 = new int[]{3, 126416510, 2196, 291, 4104, 1417, 951210, 48491};
    for(int number : numbers1){
        if(number % 2 == 0){
            System.out.println("Oh");
        }else{
            System.out.println("Yeah");
        }
    }
        
    //while
    int w = 0;
    while(w < 10){
        System.out.println(w);
        w++;
    }
    //Write a Java program that prompts the user to enter positive integers one by one. The program should keep asking for input until the user enters 0. Once 0 is entered, the program should display the sum and count of all the positive integers entered (excluding the 0).
    //solution
    Scanner s = new Scanner(System.in);
    
    int counter = 0;
    int sum1 = 0;
    System.out.println("Enter a positive integer (0 to stop):");
    int input = s.nextInt();//input after the String above
    while (input != 0){ //! >>>!=0<<<
        if(input > 0){  //! prevent negative input
            counter++;
            sum1 += input; 
        }else{
            System.out.println("Please enter a positive integer");
        }
        System.out.println("Enter a positive integer (0 to stop):"); //! while input!=0, do this
        input = s.nextInt();
    
    }
    System.out.println("You entered "+ counter +" numbers"); //! while input=0, do this
    System.out.println("The total number is "+ sum1);
    
    s.close(); //!close scanner?

    //Write a Java program that simulates a simple number guessing game. The program randomly selects a number between 1 and 100. The user has to guess the number, and the program gives hints like "Too high" or "Too low" after each guess. The game continues until the user guesses the correct number.
    //eg set the number to be 45
    Scanner s1  = new Scanner(System.in);
    int target = 45;
    int counter1 = 0;
    System.out.println("I'm thinking of a number between 1 and 100.");
    System.out.println("Take a guess:");
    int input1 = s1.nextInt();
    while (input1 != target){
        if(input1 >= 1 && input1 <= 100){
            counter1++;
            if(input1 > target){
                System.out.println("Too large");
            }else{
                System.out.println("Too low");
            }
        }else{
            System.out.println("The number is out of range");
        }
        System.out.println("Take a guess:");
    input1 = s1.nextInt();
    }
    System.out.println("Correct! You guessed it in "+counter1+" tries.");
    
    s1.close();

//Write a Java program that stores an array of integers. Use a for-each loop to calculate and print:
//1.The sum of all the numbers.
//2. The count of even numbers.
//3. The maximum number in the array.
    
    int[] numbers = {12, 7, 22, 5, 9, 30};
    int sum = 0;
    int evenCount = 0;
    int maxNum = Integer.MIN_VALUE; // Better than starting with 0;
    for(int number : numbers){
        sum += number;
        if(number%2 == 0){evenCount++;}
        if(maxNum < number){
            maxNum = number;
        }
    }System.out.println("Sum: "+sum);
    System.out.println("Even numbers count: "+evenCount);
    System.out.println("Maximum number: "+maxNum);

//     Write a Java program that stores a 3x3 matrix of integers. Use nested for-each loops to:
// Print all the elements in matrix form.
// Calculate and print the sum of all elements.
    int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
int sumValue = 0;
for(int[] row : matrix){
    for(int value : row){
        sumValue += value;
    }
}System.out.println("Sum of all elements: "+sumValue);

  }
  
}
