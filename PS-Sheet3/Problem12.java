
/*
 * Problem 12: Print a Pascal’s Triangle
Difficulty: Medium
Topics: Matrix Pattern
Hint: Print Pascal’s Triangle up to N rows. Each row should be constructed based on the sum of the elements directly above it in the previous row.

Example 1: Input: n = 4
Output:

   1
  1 1
 1 2 1
1 3 3 1
 */
public class Problem12 {

    public static void main(String[] args) {
        int n = 4;
        printPasclepattern(n);
    }
    public static void printPasclepattern(int n){
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}