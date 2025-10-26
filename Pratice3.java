public class Pratice3 {
      public static void main(String[] args) {
        
       /*! Primitives
       byte, short, int, long, float, double, char, boolean
       */
       
       //!How to assign
       long l= 9999999999999999L; //number default to be int, 999....999 overlimit,  +L to become long
       float f = 0.111f; // every decimal # default to be double, +f to become float
       
       //!Order
       
       char c1 = 'A' ;//singal character from \u0000 to \uffff (unicode)
       byte b1 = 100; // -128 ~127
       short s1 = b1; // -3xxxx ~ 3xxxx-1
       int i1 = s1; // -2.14B ~ 2.14B-1
       long l1 = i1; 
       float f1 = l1;
       double d1 = f1; //double of float
       
       //!boolean, comparison operators >, <, >=, <=, ==, !=, &&, ||, !
       int a = 1000;
       int b = 1234;
       int c = 1000;
       int d = 1235;
       
       boolean aLargerB = a > b;
       System.out.println(aLargerB);//false
       
       System.out.println(a > b);//false
       System.out.println(a < b);//true
       
       boolean acSame = a == c; // == equals,true ; else,false
       System.out.println(acSame);//true
       
       
       System.out.println(a != c);//false
       
       boolean bLarEquD = b >= d;
       System.out.println(bLarEquD);//false
       
       System.out.println(b <= d); //true
       
       System.out.println(a==c && a<b);//true
       System.out.println(a>b && a<b); //false
       System.out.println(a>b || a<b); //true
       System.out.println(!aLargerB); //true

       //! if
       if(a > b){
        System.out.println(true);
       } else{System.out.println(false);
       }
       //format: if(event){action if true}else{action if else}....
       //see excel: =if(event,if true,if false)
       
       //! Max/Min value
       
        System.out.printf("%d ~ %d%n", 
                Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("%d ~ %d%n", 
                Double.MIN_EXPONENT, Double.MAX_EXPONENT);
        System.out.printf("%h ~ %h%n", 
                Character.MIN_VALUE, Character.MAX_VALUE);

        System.out.printf("%b ~ %b%n", 
                Boolean.TRUE, Boolean.FALSE);
        
       //! Overflow, Promotion
       byte b2 = 127;
       b2++;
       System.out.println(b2);//! not 128,but -128
       // -128 -127 ... 0 1 2 ... 126 127 -loop-> -128 -127 ... 0 1 2 ...
       //!Need promotion
       //!Predict the result first, choose right primitives
       b2 = 127;
       int i2 = b2;
       i2++;
       System.out.println(i2);
       //Solution
       
       //! Downcasting
       long l2 = 2147483649L;
       int i3 = (int)l2; //insist change to int ->overflow
       System.out.println(i3);
       
       double d2 = 0.16486126;
       float f2 = (float)d2; //insist change to float->may precision lost
       System.out.println(f2);
       
       
       
       
       
       
       
     
      
    }

  
}
