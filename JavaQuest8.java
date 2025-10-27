public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] testCase1 = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] testCase2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] testCase3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] testCase4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    // code here ...
    int[][] allCases = {testCase1, testCase2, testCase3, testCase4};
    for(int i = 0; i < allCases.length; i++){
        int secondMax = allCases[i][0];
    int max = allCases[i][0];
        
    for(int j = 0; j < allCases[i].length; j++){
        
        if(max<=allCases[i][j]){
            secondMax = max;
            max = allCases[i][j];
        }else if(max>allCases[i][j] && secondMax < allCases[i][j]){
            secondMax = allCases[i][j];
        
        }
    } System.out.println("Second Max = " + secondMax);
    }
    
  }
}
