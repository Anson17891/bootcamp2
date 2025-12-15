import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.*;
public class DataStructureExercise2 {
  public static void main(String[] args) {
    // Exercise 1: Queue Basic Operations
    // 1a. Create a Queue of integers using LinkedList.
    // 1b. Add the numbers: 5, 10, 15, 20, 25.
    // 1c. Print the head of the queue without removing it.
    // 1d. Remove two elements from the queue.
    // 1e. Print the remaining queue and its size.

Queue<Integer> q1 = new LinkedList<>(List.of(5,10,15,20,25));
System.out.println(q1.peek());
q1.poll();
q1.poll();
System.out.println(q1 + "," +q1.size());


    // Exercise 2: Queue Simulation
    // 2a. Create a Queue of Strings representing customers in a bank line.
    // Add the following customers: "Alice", "Bob", "Charlie", "David".
    // 2b. Serve (remove) the first two customers.
    // 2c. Print the remaining customers in the queue.
    // 2d. Add two new customers: "Eva", "Frank".
    // 2e. Write a method that processes the queue until it is empty, printing each served customer.

Queue<String> q2 = new LinkedList<>(List.of("Alice","Bob","Charlie","David"));
q2.poll();
q2.poll();
System.out.println(q2);
q2.offer("Eva");
q2.offer("Frank");

while(q2.size()>0){
    System.out.println(q2.poll());
}
System.out.println("All customer served");


    // Exercise 3: Palindrome Checker
    // 3a. Write a method `isPalindrome(String word)` using a Deque<Character>.
    // It should return true if the word is a palindrome, false otherwise.
    // Example: "level" -> true, "hello" -> false.
    System.out.println(DataStructureExercise2.isPalindrome("level"));
    System.out.println(DataStructureExercise2.isPalindrome("hello"));



    // Exercise 4: Browser History Simulation
    // 4a. Use a Deque<String> to simulate browser history navigation.
    // Add pages: "google.com", "facebook.com", "youtube.com", "github.com".
    // 4b. Simulate "back" and "forward"g navigation using deque operations.
    // 4c. Print the current page after each operation.
    
    Deque<String> d4 = new LinkedList<>(List.of("google.com","facebook.com","youtube.com","github.com"));
    Deque<String> backStack = new LinkedList<>();
    Deque<String> forwardStack = new LinkedList<>();
    
    //back
    if(d4.size()<=1)
    System.out.println("You are now in oldest page.");
    backStack.add(d4.pollLast());
    System.out.println("You are now in " + d4.peekLast());

    
    //forward
     if(backStack.isEmpty()){
         System.out.println("You are now in newest page.");
     }
     d4.addLast(backStack.pollLast());
    System.out.println("You are now in " + d4.peekLast()); 

    // Exercise 5: Word Frequency Counter
    // 5a. Create a method `countWordFrequency(String text)` that uses a HashMap<String, Integer>.
    // 5b. The method should split the text by spaces and count occurrences of each word.
    // Example input: "apple banana apple orange banana apple"
    // Output: {apple=3, banana=2, orange=1}
    // 5c. Print the word with the highest frequency.
    
    HashMap<String, Integer> m5 = countWordFrequency("apple banana apple orange banana apple");
    System.out.println(m5);
    int max = 0;
    for(Map.Entry<String, Integer> fruit : m5.entrySet()){
    if(fruit.getValue()>max)
    max=fruit.getValue();}
    for(Map.Entry<String, Integer> fruit : m5.entrySet()){
    if(fruit.getValue()==max)
    System.out.println(fruit.getKey());}
    
    
    // Exercise 6: Student Directory with HashMap
    // 6a. Create a HashMap<Integer, Student> where key = student ID, value = Student object.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // ID: 4, Name: David
    // 6b. Write a method to search for a student by ID.
    // 6c. Write a method to remove a student by ID.
    // 6d. Print all student names in alphabetical order.



    // Exercise 7: Inverse Mapping
    // 7a. Create a HashMap<String, String> mapping countries to capitals:
    // {"USA" -> "Washington", "France" -> "Paris", "Japan" -> "Tokyo", "India" -> "Delhi"}
    // 7b. Create an inverse mapping (capital -> country) using another HashMap.
    // 7c. Print the inversed map.
    
    Map<String,String> m7= new HashMap<>();
    m7.put("USA","Washington");
    m7.put("France","Paris");
    m7.put("Japan","Tokyo");
    m7.put("India","Delhi");
    Map<String,String> reverseM7 = new HashMap<>();
    for(Map.Entry<String,String> country : m7.entrySet()){
        reverseM7.put(country.getValue(),country.getKey());
    }
    System.out.println(reverseM7);
    
     // Exercise 8: HashMap with Multiple Values
    // 8a. Create a HashMap<String, ArrayList<String>> to store subjects taken by each student.
    // 8b. Add:
    //      "Alice" -> ["Math", "Science"]
    //      "Bob" -> ["History"]
    //      "Charlie" -> ["Math", "English"]
    // 8c. Add "English" to Bob’s subjects.
    // 8d. Print each student with their subjects.
    // 8e. Write a method to return all students taking "Math".
    
    HashMap<String, ArrayList<String>> m8= new HashMap<>();
    m8.put("Alice",new ArrayList<String>(List.of("Math","Science")));
    m8.put("Bob",new ArrayList<String>(List.of("History")));
    m8.put("Charlie",new ArrayList<String>(List.of("Math","English")));
    m8.get("Bob").add("Engilsh");
    for(Map.Entry<String, ArrayList<String>> student : m8.entrySet()){
        System.out.println("Name=" + student.getKey() + " ,Subjects=" + student.getValue());
    }
    for(Map.Entry<String, ArrayList<String>> student : m8.entrySet()){
        if(!student.getValue().contains("Math"))
        student.getValue().add("Math");
    }
    
    
  }
  
  //Q3
  public static boolean isPalindrome(String s){
      if(s == null) return false;
      
      Deque<Character> d3 = new LinkedList<>();
      for(char c : s.toCharArray()){
          d3.addLast(c);
      }

      while(d3.size()>1){
          char first = d3.pollFirst();
          char last = d3.pollLast();
          if(first!=last)
          return false;
      }
      return true;
  }
  
  //Q5
  public static HashMap<String, Integer> countWordFrequency(String text){
      if(text == null)throw new IllegalArgumentException("text cannot be null.");
      HashMap<String, Integer> m5 = new HashMap<>();
      String[] s5 = text.toLowerCase().split("[^A-Za-z0-9]");
      for(String s : s5){
          if(s.isEmpty()) continue;
          m5.put(s, m5.getOrDefault(s,0)+1);
      }
      return m5;
  }



   public static class Student {
    private int id;
    private String name;

  public Student(){}
  public Student(int id, String name){
      this.id = id;
      this.name = name;
  }
  public int getId(){return this.id;}
  public String getName(){return this.name;}
  

 @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

  
  public static void main(String[] agrs){
Student s1 = new Student(1,"Alice");
Student s2 = new Student(2,"Bob");
Student s3 = new Student(3,"Charlie");
Student s4 = new Student(4,"David");

Map<Integer, Student> m6 = new HashMap<>();
m6.put(s1.getId(),s1);
m6.put(s2.getId(),s2);
m6.put(s3.getId(),s3);
m6.put(s4.getId(),s4);
List<Student> students = new ArrayList<>(m6.values());

List<Student> sortedByName = students.stream()//
        .sorted(Comparator.comparing(Student::getName))//
        .collect(Collectors.toList());
        System.out.println(sortedByName);
        

  }
}
    // Constructor
    // getter, setter, etc.
  }



