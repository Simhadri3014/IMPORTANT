public class ArrayMatcher
 {
    public static void printMatchingPositions(int[][] array1, int[][] array2) 
     {
        for(int i = 0 ; i< array1.length; i++)
         {
        //   System.out.println("Matching at position 1st for loop " + i );

           for(int j=0;j<= array1.length;j++)
            {
         // 	 System.out.println("Matching at position 2nd for loop "+j);

              if(array1[i][j]==array2[i][j])
             {
                System.out.println("Matching at position ( " + i + ", " + j + " )");
              }
            }
         }
    }
    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] array2 = {
            {1, 0, 3},
            {7, 5, 0}
        };
        printMatchingPositions(array1, array2);
    }
}