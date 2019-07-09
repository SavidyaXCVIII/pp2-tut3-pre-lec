package DefiningMethods;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        int firstTime;
        int secondTime;
        do {
            System.out.println("Enter first time (24-hour):");
             firstTime = inputIntValidation();
        }while(firstTime < 0 || firstTime > 24);

        do {
            System.out.println("Enter second time (24-hour):");
            secondTime = inputIntValidation();
        }while(secondTime < 0 || secondTime > 24);

        System.out.printf("Answer in minutes is %d",timeDifferenceInMinutes(firstTime,secondTime));


    }
    private static int timeDifferenceInMinutes(int firstTime, int secondTime){
        int change = Math.abs(firstTime - secondTime);
        return change * 60;
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
