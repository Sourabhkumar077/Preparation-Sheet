import java.util.Scanner;

/*
Checking for Armstrong Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all Armstrong numbers within a given range.
Example:
Input: range = [1, 500]
Output: [1, 153, 370, 371, 407]
Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.
 */
public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of range: ");
        int start = sc.nextInt();
        System.out.print("enter the ending of range : ");
        int end = sc.nextInt();
        armstrongInRange(start,end);
        sc.close();

    }
    public static void armstrongInRange(int start , int end){
        for(int i = start; i <= end; i++){
            if(checkArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean checkArmstrong(int number){
        int temp = number;
//        find length of number
        int numLength = 0;
        while(temp!= 0) {
            temp /= 10;
            numLength++;
        }
         temp = number;
//        check for armstrong
        int result = 0;
        while(temp != 0){
            int unitDigit = temp % 10;
            result += (int)Math.pow(unitDigit,numLength);
            temp /= 10;
        }

        return result == number;

    }
}



