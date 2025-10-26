public class Pratice2 {
  public static void main(String[] args) {
    
  
       /* Operators
        +, -, *, /, %, ++, --, +=, -=, *=, /=, %=, ...
        */
        
        //! 1. +-*/
        // int +-*/ int -> int
        // int +-*/ double -> double
        // double x = int +-*/ int -> double x= int ->double x = (double)int
        //                           !^cause precision loss
        
        //! 2. %
        int a = 13456;
        int b = 17;
        int c = a % b;
        System.out.println(c); //9  13456/17= 791...9
        
        //! 3. ++, --
        int d = 1;
        d++; //++d
        System.out.println(d); //2
        d--; //--d
        System.out.println(d); //1
        
        for(int e = 0; e<10; e++){
            System.out.println(e);  // from e=0 -> e++ -> until e<10 (e=9)
        }
        
        //pre++
        //++d +=4;error
        int f = ++d + 4;
        System.out.println(f); //6 //++d + 4 => f=((d++);+4);  ,d++ do before calculation
        System.out.println(d); //                ^from here
        
        //post++
        d = 1;
        int g = d++ + 4;
        System.out.println(g); //5 // d++ + 4 => g=(d+4); d++; , d++ do after calculation
        System.out.println(d);
        
        //f = ++d; <-not same->f = d++;

        //! 4. +=, -=, *=, /=, %=
        
        d = 1;
        d += 1;
        System.out.println(d);//2
        d -= 1;
        System.out.println(d);//1
        d *= 4;
        System.out.println(d);//4
        
        d /= 3.0; //!result still in int
        System.out.println(d); //1
        //solution
        double doubleD = d; 
        doubleD /= 3.0;
        System.out.println(doubleD);
        
        d = 10;
        d %= 3;
        System.out.println(d);//1
        
        
        

  
}
}