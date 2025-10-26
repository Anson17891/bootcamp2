public class Pratice5 {
      public static void main(String[] args) {
        
        //Math
        
        //! Math.max(), Math.min()
        String quote1 = "The quick brown fox";
        String quote2 = "The lazy dog";
        System.out.println(Math.max(quote1.length(), quote2.length()));
        System.out.println(Math.min(quote1.length(), quote2.length()));
        //Compare 2 numbers
        
        //! Math.sqr(), Math.pow()
        System.out.println(Math.sqrt(10)); //Math.cbrt() for cube root
        System.out.println(Math.pow(10.0, 0.25)); //for nth root, use pow, 
        System.out.println(Math.pow(10, 1/4));//!careful for precicion loss, 
        //Math.pow(double x, double y)
        
        System.out.println(Math.pow(10, 2)); //10^2
        
        //! Rounding
        System.out.println(Math.ceil(10.9123)); 
        System.out.println(Math.ceil(10.4987)); //Roundup/ceiling  10<x<11, x=>11
        
        System.out.println(Math.floor(10.9123)); 
        System.out.println(Math.floor(10.4987));//Rounddown/floor  10<x<11, x=>10
        
        System.out.println(Math.round(10.9123)); 
        System.out.println(Math.round(10.4987)); //=Math.floor(x+0.5)
        
        
        
 
    }

}
