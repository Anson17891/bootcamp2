package praticemaven;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString


public class Persona {
  private String name;
  private int age;
  private double height;
  private double weight;

//! Automatically generate by lombok , no need to hand write

//!constructors
// public Persona(String name, int age, double height, double weight){
//   this.name = name;
//   this.age = age;
//   this.height = height;
//   this.weight = weight;
// }
// public Persona(){}

//!Getter Setter
// public String getName(){return this.name;}
// public int getAge(){return this.age;}
// public double getHeight(){return this.height;}
// public double getWeight(){return this.weight;}
// public void setName(String name){this.name=name;}
// public void setAge(int age){this.age=age;}
// public void setHeight(double height){this.height=height;}
// public void setWeight(double weight){this.weight=weight;}

//!Bulder Pattern
// public Builder builder(){return new Builder();}
// public static class Builder{
//   private String name;
//   private int age;
//   private double height;
//   private double weight;
// public Builder(){}
// public Builder name(String name){
//   this.name = name;
//   return this;
// }
// public Builder age(int age){
//   this.age=age;
//   return this;
// }
// public Builder height(double height){
//   this.height = height;
//   return this;
// }
// public Builder weight(double weight){
//   this.weight = weight;
//   return this;
// }
// public Persona build(){
//   return new Persona(this.name, this.age, this.height, this.weight);
// }
// } 

//! Equals HashCode ToString
// @Override
// public boolean equals(Object o){
//   if(this == o){
//     return true;
//   }
//   if(!(o instanceof Persona)){
//     return false;
//   }
//   Persona p = (Persona) o;
//  return Objects.equals(this.name,p.getName())//
//     &&Objects.equals(this.age,p.getAge())//
//     &&Objects.equals(this.height,p.getHeight())//
//     &&Objects.equals(this.weight,p.getWeight());
//   }
//   @Override
//   public int hashCode(){
//     return Objects.hash(this.name,this.age,this.height,this.weight);
//   }
//   @Override
//   public String toString(){
//     return "Persona( Name="//
//            +this.name + ", Age="//
//            +this.age + ", Height="//
//            +this.height + ", Weight="//
//            +this.weight + ")"; 
//   }

public Persona fusion(Persona person){
  return new Persona(person.getName()+"-"+this.name//
          , (person.getAge()+this.age)/2//
          , (person.getHeight()+this.height)/2.0//
          , (person.getWeight()+this.weight)/2.0);
}

public static void main(String[] args) {
  
Persona p1 = new Persona();
Persona p2 = new Persona("Tom",1,2.0,2.0);
Persona p3 = new Persona().builder().name("Leo").age(2).height(1.2).weight(1.2).build();

p1.setName("Tom");
p1.setAge(1);
p1.setHeight(2.0);
p1.setWeight(2.0);

p2.getName();

System.out.println(p1.equals(p2)); //true
System.out.println(p1.equals(p3));  //false

System.out.println(p3.toString()); //Persona(name=Leo, age=2, height=1.2, weight=1.2)
}


}
