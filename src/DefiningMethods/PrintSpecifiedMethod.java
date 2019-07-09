package DefiningMethods;

import java.util.Scanner;

public class PrintSpecifiedMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string print : ");
        String string = input.nextLine();
        System.out.println("Enter how many number of times you want to print : ");
        printString(string,inputIntValidation());


    }
    private static void printString(String string, int amount){
        int i = 0;
        while(i < amount){
            System.out.println(string);
            i++;
        }
    }

    private static int inputIntValidation(){
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){
            System.out.print("Invalid, enter again : ");
            input.next();
        }
        return input.nextInt();
    }
}
