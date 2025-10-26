import java.util.Arrays;

public class Pratice9 {
  public static void main(String[] args) {
    
    //! Array
    int[] arr = new int[4];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;

    //Other expression
    int[] arr1 = new int[]{1, 2, 3, 4};

    //Other primitive array
    String[] arr2 = new String[]{"The", "quick", "brown", "fox"};
    char[] arr3 = new char[]{'W','T','F'};

    //Print out an array in String "[x, y, z, ...]"
    System.out.println(Arrays.toString(arr3));
    //Directly print out an array
    System.out.println(arr3);

    //How many objects in array
    System.out.println(arr3.length);

    //equals
    System.out.println(arr3.equals(arr));

    //! Combine w/ for loop
    //eg count vowel in arr2
    int[] arr2Count = new int[arr2.length];
    int vowelCount = 0;
    for(int i = 0; i < arr2.length; i++){
      for(int j = 0; j < arr2[i].length(); j++){
        if(arr2[i].charAt(j) == 'a'||arr2[i].charAt(j) == 'e'||arr2[i].charAt(j) == 'i'||arr2[i].charAt(j) == 'o'||arr2[i].charAt(j) == 'u'){
          arr2Count[i]++;
          vowelCount++;
        }
      }System.out.println("In "+arr2[i]+", there are "+arr2Count[i]+" vowel(s)");
    }System.out.println("There are totally "+vowelCount+" vowels in this array");


  }
}
