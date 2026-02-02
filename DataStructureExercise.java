import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class DataStructureExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.
List<Integer> l1 = new ArrayList<>(List.of(10,20,30,40,50));
System.out.println(l1);
l1.remove(Integer.valueOf(30));
System.out.println(l1.size());
System.out.println(l1);


    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
List<String> l2 = new ArrayList<>(List.of("Apple","Banana","Mango","Orange"));
//l2.addIfAbsent("Grapes");
if(!l2.contains("Grapes"))
l2.add("Grapes");
l2.replaceAll(fruit ->fruit.equals("Mango")?"Peach":fruit);
//alt: for(int i = 0; i<l2.size();i++){if("Mango".equals(fruits.get(i)))fruits.set(i,"Peach");}
System.out.println(l2);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
List<Integer> l3 = new ArrayList<>(List.of(10,20,10,30,40,20,50));
Set<Integer> s3 = new HashSet<>(l3);
List<Integer> l3Trimmed = new ArrayList<>(s3).stream().sorted().collect(Collectors.toList());
System.out.println(l3Trimmed);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

Set<String> s4 = new HashSet<>(Set.of("USA","India","China","Japan"));
s4.add("Canada");
s4.add("India");
System.out.println(s4);//Only one India

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
Set<Double> s5 = new HashSet<>(Set.of(1.1,2.2,3.3,4.4,5.5));
System.out.println(s5.contains(3.3));
s5.remove(2.2);
System.out.println(s5.size());


    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

Set<Integer> s6a = new HashSet<>(Set.of(10,20,30,40));
Set<Integer> s6b = new HashSet<>(Set.of(30,40,50,60));
List<Integer> l6b = new ArrayList<>(s6b);
for(int n : l6b){
    int size = s6a.size();
    s6a.add(n);
    if(size==s6a.size())
    System.out.println(n);
}

//!Solution
s6a.retainAll(s6b);
System.out.println(s6a);

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

Set<String> s7 = new HashSet<>(Set.of("Cherry","Steve","Chole","Jenny", "Vicky"));
List<String> l7 = new ArrayList<>(s7);
System.out.println(l7);//Not following input order

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

List<Student> l8 = new ArrayList<>(List.of(
                   new Student(1,"Alice"),
                   new Student(2,"Bob"),
                   new Student(3,"Charlie")));
for(Student s : l8){
    System.out.println(s.toString());
} 
l8.remove(1); //alt: for loop + remove by index
System.out.println(Student.searchById(l8,2));
List<Student> l8a = new ArrayList<>();
for(Student s : l8){
    if(s.getName().startsWith("A"))
    l8a.add(s);
}
System.out.println(l8a);




    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.

Set<Student> s9a = new HashSet<>(Set.of(
                  new Student(1,"Alice"),
                  new Student(2,"Bob"),
                  new Student(3,"Charlie")));
Set<Student> s9b = new HashSet<>(Set.of(
                  new Student(2,"Bob"),
                  new Student(3,"Charlie"),
                  new Student(4,"David")));
for(Student s : s9b){
    if(s9a.add(s)==false)
    System.out.println(s.getName());
}
//! alt use retainAll() + override equals()+hash()


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
  public void setId(int id){this.id = id;}
  public void setName(String name){this.name = name;}
  @Override
  public String toString(){
      return "Student("//
             +"id="//
             +this.id//
             +" ,name="//
             +this.name//
             +")";
  }
  @Override
  public boolean equals(Object o){
      if(o==this)
      return true;
      if(!(o instanceof Student))
      return false;
      Student s = (Student) o;
return Objects.equals(this.getId(), s.getId())
        && Objects.equals(this.getName(), s.getName());

   
      }
  
 @Override
  public int hashCode(){
      return Objects.hash(this.id,this.name);
  }
  
public static String searchById(List<Student> students, int id){
    for(Student s : students){
    if(s.getId()==id)
    return s.getName();
}return "Student not found";
}
}
    // Constructor
    // getter, setter, etc.
  }

 

