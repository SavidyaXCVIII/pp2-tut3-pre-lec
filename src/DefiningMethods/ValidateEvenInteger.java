package DefiningMethods;

import java.util.Scanner;

public class ValidateEvenInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer : ");
        System.out.println(testEvenInteger(inputIntValidation()));

    }
    private static boolean testEvenInteger(int number){
        return (number % 2 == 0);
    }
    private static int inputIntValidation(){
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){
            System.out.print("Invalid amount, enter again : ");
            input.next();
        }
        return input.nextInt();
    }
}
