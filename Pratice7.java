import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pratice7 {
  public static void main(String[] args) {


    //for loop
     for (int i = 0; i < 10; i++){
     System.out.println(i);
     } // print from 0 to 9
     


    for (int i = 0; i < 10; i++){
    BigDecimal part1 = new BigDecimal((1+Math.sqrt(5))/2.0);
    BigDecimal part2 = new BigDecimal((1-Math.sqrt(5))/2.0);
    BigDecimal part3 = BigDecimal.valueOf(1/Math.sqrt(5));
    BigDecimal part1a = part1.pow(i);
    BigDecimal part2a = part2.pow(i);
    double fibonacci = part3.multiply(part1a.subtract(part2a))//
    .setScale(2, RoundingMode.HALF_UP)//
    .doubleValue();
    System.out.println(fibonacci);
     } //Fibonacci sequence  WTF

     for (char i = 35; i <= 60; i+=1){
         System.out.println(i);
     } // i can be byte~long, for alphabet/sign->use char
     
     for (int i = 0; i<10; i++){
        double geoProg = 2 * Math.pow(2,i);
        System.out.println(geoProg);
     }//Geometric progression a,n=ar^(n-1)
     
     //!still, beware of bigdecimal/overflow/int<->double

     for (double i = 0; i>-0.1; i-=0.01){
         System.out.println(i);
     }
     //!-0.060000000000000005, -0.09999999999999999
     //solution
     for(int i = 0; i < 10; i++){
      double minus = -0.01*i;
      System.out.println("minus= " + minus);
     }

     int p = 10;
     for(int i = 0; i < 10; i++){
         double y = i+1;
      double z = p/y; // int / double ->double
        System.out.println(Math.round(z*100)/100.0); //! dont forget .0
     }

 //nested loop, inner loop and outer loop
         for(int i = 1; i<=5; i++){
         System.out.println("i is now: " + i);
         for(int j = 1; j<=3; j++){
           System.out.println(i*j+"");
         }
          }

     
    //Write a Java program that prints all the even numbers between 1 and 100, and also calculates the sum of these even numbers.
    int total = 0;
    for(int i = 1; i<=100; i++){
        if(i % 2 == 0){
            System.out.println(i);
            total=total+i;
        }
    }System.out.println(total);
    
    //Write a Java program that prints a multiplication table from 1 to 10. Each row should represent the multiplication results for one number, and each column should show the result of multiplying that number by another number from 1 to 10.
    for(int i = 1; i<=10; i++) {
        for(int j = 1; j <= 10; j++) {
            System.out.print(i+" x "+j+" = "+i*j + " ");
        } 
        //println->print next result at next line
        //print->print next result on the same line
        System.out.println();
    }
     
   // Write a Java program that takes an array of integers and finds the second largest number in the array. You must use a for loop to iterate through the array.
        int[] arr = new int[6];
        arr[0] = 90;
        arr[1] = 45;
        arr[2] = 1;
        arr[3] = 78;
        arr[4] = 34;
        arr[5] = 78;
        
        int largestNum = arr[0];
        int secLargest = 0; //! don't assign to arr[0] //can use = Integer.MIN_VALUE instead
        for(int i = 0; i < 6; i++){
            if(arr[i] > largestNum){
                secLargest = largestNum;
                largestNum = arr[i];
            }else if(arr[i] != largestNum && arr[i] > secLargest){
                secLargest = arr[i]; //ensure arr[i]<secLargest<largest
            }
            System.out.println(secLargest);
        }

        //Write a Java program that takes an array of integers and determines whether any three distinct elements in the array can form a Pythagorean triplet.
        int[] arr2 = new int[5];
        arr2[0] = 3;
        arr2[1] = 1;
        arr2[2] = 4;
        arr2[3] = 6;
        arr2[4] = 5;

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                for(int k = 0; k<5; k++){
                   int a = arr2[i];
                   int b = arr2[j];
                   int c = arr2[k];

                   if(i != j && j != k && k != i && (Math.pow(a,2) + Math.pow(b,2)) == Math.pow(c,2)){
                       System.out.println("Possible combination: i=" + i +";j=" + j + ";k="+k);
                   }
                }
            }
        }
        //Write a Java program that takes an array of integers and finds the longest increasing contiguous subsequence.
        int[] arr3 = new int[12];
        arr3[0] = 5;
        arr3[1] = 6;
        arr3[2] = 3;
        arr3[3] = 5;
        arr3[4] = 7;
        arr3[5] = 8;
        arr3[6] = 1;
        arr3[7] = 2;
        arr3[8] = 3;
        arr3[9] = 4;
        arr3[10] = 5;
        arr3[11] = 6;
        
        int longestStartIdx = 0;
        int currentStartIdx = 0;
        int currentCount = 1;
        int maxCount = 1;
        
        for(int i = 1; i < arr3.length; i++){
            if(arr3[i] > arr3[i-1]){
                currentCount++;
            }else if(arr3[i-1] > arr3[i]){
                currentStartIdx = i;
                currentCount = 1;
            }
            if(currentCount > maxCount){
                maxCount = currentCount;
                longestStartIdx = currentStartIdx; //!!!!!!!!!!!!!!
            }  
        }
        
        System.out.print("[");
        for(int i = longestStartIdx; i < longestStartIdx + maxCount; i++){ // i < longestStartIdx + maxCount is more general representation (if there are many items)
            if(i == longestStartIdx + maxCount - 1){
                System.out.print(arr3[i]);
         }else {System.out.print(arr3[i] + ", ");
          }
        } System.out.print("]");




  }
  
}
