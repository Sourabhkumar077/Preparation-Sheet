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
        int num = 2;
        for (int i = 1; i <= rows; i++) {
            int primesPrinted = 0;
            while (primesPrinted < i) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    primesPrinted++;
                }
                num++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) { // Using i * i instead of Math.sqrt for efficiency
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
