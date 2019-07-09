package DefiningMethods;

import java.util.Scanner;

public class PrintMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string print 3 times : ");
        printString(input.nextLine());
    }

    private static void printString(String string){
        int i = 0;
        while(i < 3){
            System.out.println(string);
            i++;
        }
    }
}
