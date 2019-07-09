package DefiningMethods;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Enter the amount you want to convert :");
        double amount = inputIntValidation();
        System.out.println("Enter currency rate : ");
        System.out.printf("Answer is %.2f",converter(amount,inputIntValidation()));

    }
    private static double converter(double amount, double rate){
        return amount * rate;
    }
    private static Double inputIntValidation(){
        Scanner input = new Scanner(System.in);
        while (!input.hasNextDouble()){
            System.out.print("Invalid amount, enter again : ");
            input.next();
        }
        return input.nextDouble();
    }

}
