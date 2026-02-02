
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class PersonaTest{
@Test

void testAllArgsConstructor(){
Persona p1 = new Persona("Leo",1,233.3,52.5);

String expectedName = "Leo";
String expectedName2 = "May";

Assertions.assertEquals(expectedName, p1.getName());
Assertions.assertEquals(expectedName2, p1.getName());
}

@Test
void testFusion(){
  Persona p1 = new Persona("Leo",1,1.3,2.2);
  Persona p2 = new Persona("Mary",21,3.9,6.6);

  Persona expectedPersona = new Persona("Leo-Mary", 11, 2.6, 4.4);
  Assertions.assertEquals(expectedPersona, p1.fusion(p2));
}


}
