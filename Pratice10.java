import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pratice10 {
  public static void main(String[] args) {
    
    
//Problem of just double
double a = 0.1;
double b = 0.2;
double c = a + b;
System.out.println(c); //0.30000000000000004 WTF

//!Solution BigDecimal!!!
BigDecimal a1 = BigDecimal.valueOf(0.1);
BigDecimal b1 = BigDecimal.valueOf(0.2);
BigDecimal c1 = a1.add(b1);
System.out.println(c1.doubleValue()); //0.3!!!

//!Declaration
//BigDeciaml xxx = BigDecimal.valueOf(000)
//BigDecimal.valueOf(yyy)

//!4 operators +-*/ in BD
System.out.println(a1.add(b1).doubleValue());
System.out.println(a1.subtract(b1).doubleValue());
System.out.println(a1.multiply(b1).doubleValue());
System.out.println(a1.divide(b1).doubleValue());

//Divide
System.out.println(BigDecimal.valueOf(3.14159265).divide(BigDecimal.valueOf(6.02), 8,RoundingMode.HALF_UP).doubleValue());
//! .divide(x, decimal place, RoundingMode)

//.setScale(decimal place, RoundingMode)

//!Check how many roundingmode!?

  }
  
}
