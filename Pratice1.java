public class Pratice1 {
  public static void main(String[] args) {  //Heading of any project

    System.out.println("Hello World"); //Hello world :)
    
    int x = 3; //declare variable x as int & assign x=3
    System.out.println(x); //print out variable x

    int a = 1;
    int b = 2;
    int totalab = a + b; // int +-*/ int = int
    System.out.println(totalab);
    int diffab = a - b;
    System.out.println(diffab);

    double y = 3; //declare y as double, & y=3->3.0
    //double->having decimal place = float?
    System.out.println(y);

    //! int totalay = a + y; 
    //int +-*/ double = double
    //! double totalay = a + y; 
    //^solution
    double totalby = b+ y;
    System.out.println(totalby);

    int aPrice = 91;
    int bPrice = 13;
    int cPrice = 14;
    int averagePrice = ( aPrice + bPrice + cPrice ) / 3;
    System.out.println(averagePrice);
    //! only print out int result
        double averagePrice2 = ( aPrice + bPrice + cPrice ) / 3;
    System.out.println(averagePrice2);
    //! everything are int -> result = int -> int change to double 
    double averagePrice3 = ( aPrice + bPrice + cPrice ) / 3.0;
    System.out.println(averagePrice3);
    //! 3->3.0 print out double result
    //! or declare abcPrice as double


    //Excersice
    // int appleCount = 9;
    //doubleapplePrice = 5.5;
    //int orangeCount = 4;
    //double orangePrice = 6.5;
    //double discount = 0.95;
    //finalAmount?

    int appleCount = 9;
    double applePrice = 5.5;
    int orangeCount = 4;
    double orangePrice = 6.5;
    double discount = 0.95;

    double totalApple = appleCount * applePrice;
    double totalOrange = orangeCount * orangePrice;
    double totalPrice = totalApple + totalOrange;
    double totalAppleWithDiscount = totalApple * discount;
    double totalOrangeWithDiscount = totalOrange * discount;
    double totalPriceWithDiscount = (totalApple + totalOrange) * discount;

    System.out.println(totalApple);
    System.out.println(totalOrange);
    System.out.println(totalPrice);
    System.out.println(totalAppleWithDiscount);
    System.out.println(totalOrangeWithDiscount);
    System.out.println(totalPriceWithDiscount);

    }
  
}
