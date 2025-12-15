import java.util.Scanner;

public class Pratice14 {
//   Write a Java program that:
// Prompts the user to enter a sentence.
// Reverses only the words that are longer than 3 characters using StringBuilder.
// Keeps shorter words unchanged.
// Joins the words back into a sentence and prints the result.
  public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    System.out.println("Please enter a sentence:");
    String sentence = s.nextLine(); //!for string use nextLine()
    
    String[] splitSentence = sentence.split(" ");
    StringBuilder result = new StringBuilder();  //String is immutable, new var is needed
    
    for(String word : splitSentence){
        StringBuilder reversed = new StringBuilder(word);
        if(reversed.length() > 3){
        reversed.reverse(); //direct manipulation, no need reversed=reversed.reverse()?
        }
        result = result.append((reversed).toString()).append(" ");
    }
    System.out.println(result.toString().trim()); //.trim() to delete final “ “
    }
}
    
    //////////////////////////////////////////////////////////////////////////
// You are given a string that may contain multiple spaces between words. 
//Write a method using StringBuilder to clean up the string so that:
// All leading and trailing spaces are removed.
// Multiple spaces between words are reduced to a single space.
// Example Input:
// "   The   quick brown   fox   "
class main{
   public static String removeAbundentSpace(String input){
        StringBuilder sb = new StringBuilder();
                String[] splitSentence = input.split(" ");
        for(String word : splitSentence){
            if(!word.isBlank()){  //String use .isBlank, dont use !=
            sb = sb.append(word).append(" ");
        }
        }
        return sb.toString().trim();
    }
    
     public static void main(String[] args){
    String input = "  The   quick brown   fox  ";
    System.out.println(removeAbundentSpace(input));
}
}

///////////////////////
// Write a Java method that takes an array of strings and returns a single string where each element is separated by a comma.
// Use StringBuilder to efficiently build the final string.
// Example Input:
// String[] words = {"apple", "banana", "cherry"};
class Main {
    public static String combineString(String[] words){
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word).append(",");
        }
        if(sb.length() > 0){
            sb = sb.deleteCharAt(sb.length()-1); //!.deleteCharAt(int)
        }
        return sb.toString(); //remember toString()
    }
    
    public static void main(String[] args) {
String[] words = {"apple", "banana", "cherry"};
System.out.println(combineString(words));

    }
}

