/*
 * Generating a Pattern of Prime Numbers
Difficulty: Medium
Topics: Prime Numbers, Patterns
Description: Write a program to generate a pattern where each row contains the first few prime numbers.
Example:
Input: rows = 3
Output:

2  
2 3  
2 3 5  

 */
public class Problem38 {
    public static void main(String[] args) {
        int rows = 3;
        generatePrimePattern(rows);
    }

    public static void generatePrimePattern(int rows) {
        int primeCount = 0;
        int num = 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    primeCount++;
                } else {
                    num++;
                    j--;
                }
            }
            System.out.println();
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
