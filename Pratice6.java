import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pratice6 {
  public static void main(String[] args) {
    
    double a = 0.7;
    double b = 0.4;
    System.out.println(a/b); //1.75
   
    double c = 0.7-0.4;
    double d = 0.8-0.5;
    System.out.println(c);//0.29999999999999993
    System.out.println(d);//0.30000000000000004
    System.out.println(c==d);//false
    // precision loss due to convertion of dec<->bit<->hex

    //solution
    BigDecimal a1 = BigDecimal.valueOf(a);
    BigDecimal b1 = BigDecimal.valueOf(b);
    System.out.println((a1.divide(b1, 2, RoundingMode.HALF_UP)).doubleValue()); //1.75
    /*//! For division, beware of ArithmeticException (1/3=0.33333...)
    .divide(x, decimal place, roundingmode)*/
    //!.doubleValue() change BigDecimal to double

    //other operators
    System.out.println(a1.add(b1).doubleValue());    //add
    System.out.println(a1.subtract(b1).doubleValue());//subtract
    System.out.println(a1.multiply(b1).doubleValue());//multiply, may also have ArithmeticException
    System.out.println(a1.divide(b1, 2, RoundingMode.HALF_UP).doubleValue());

    //other RoundingMode
    System.out.println(a1.divide(b1, 2, RoundingMode.CEILING).doubleValue());
    System.out.println((a1.divide(b1, 2, RoundingMode.FLOOR)).doubleValue());
    System.out.println((a1.divide(b1, 2, RoundingMode.UP)).doubleValue());//round away from 0
    System.out.println(a1.divide(b1, 2, RoundingMode.DOWN).doubleValue());//round toward 0
    System.out.println(a1.divide(b1, 2, RoundingMode.HALF_UP).doubleValue());
    System.out.println(a1.divide(b1, 2, RoundingMode.HALF_DOWN).doubleValue());
    System.out.println(a1.divide(b1, 2, RoundingMode.HALF_EVEN).doubleValue());
    /*  decimal ends up with 5, see front part, odd->round up, even->round down
    eg. 0.215->0.22 , 0.225->0.22
    aka Bankers' rounding, odd–even rounding, etc
    */
    System.out.println(a1.divide(b1, 2, RoundingMode.HALF_UP).doubleValue());
    //!System.out.println(a1.divide(b1, 2, RoundingMode.UNNECESSARY)); beware of ArithmeticException

    //other methods
    a = 0.7; //a1=bigdecimal of a
    b = 0.4; //b1=bigdecimal of b
    c = 0.8;
    d = 0.5;
    BigDecimal c1 = BigDecimal.valueOf(c);
    BigDecimal d1 = BigDecimal.valueOf(d);
    a1 = BigDecimal.valueOf(a);
    b1 = BigDecimal.valueOf(b);
    BigDecimal ab = a1.subtract(b1);
    BigDecimal cd = c1.subtract(d1);
    System.out.println(ab.compareTo(cd)); //0, is the same
    System.out.println(ab.equals(cd)); //true //!beware of 0.1 != 0.100
    System.out.println(ab.pow(2)); //0.09, in bigdecimal, pow(int x)
    System.out.println(ab.byteValue()); //0
    System.out.println(ab.floatValue()); //0.3f
    System.out.println(ab.doubleValue()); //0.3
    System.out.println(ab.intValue());//0
    System.out.println(ab.longValue());//0
    System.out.println(ab.remainder(d1));//0.3
    System.out.println(ab.max(ab));
    System.out.println(BigDecimal.valueOf(0.9156412616).setScale(1, RoundingMode.HALF_UP));
    System.out.println(ab.toString()); //!





    


  }
  
}
