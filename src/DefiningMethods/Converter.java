package DefiningMethods;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {Scanner input = new Scanner(System.in);
        System.out.println("Celsius to Fahrenheit converter");
        System.out.println("Enter the celsius value : ");
        double celsius = inputIntValidation();
        double answer = celsiusToFahrenheit(celsius);
        System.out.printf("Answer is %.2f",answer);
    }

    private static double celsiusToFahrenheit(double value){
        return  (value * 9 /5) + 32;
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
