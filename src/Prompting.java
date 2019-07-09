import java.util.Scanner;

public class Prompting {
    public static void main(String[] args) {
        double a = prompt("Enter amount : ");
        System.out.println(a);
    }

    private static double prompt(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextDouble();
    }
}
