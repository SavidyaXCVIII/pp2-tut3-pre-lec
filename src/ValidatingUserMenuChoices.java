import java.util.Scanner;

public class ValidatingUserMenuChoices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer;
        System.out.println("Select [y]es, [n]o, [q]uit");
        answer = sc.next().charAt(0);
        System.out.println("Using IF statements");
        if (answer == 'Y' || answer == 'y'){
            System.out.println("You selected yes ");
        }else if (answer == 'n' || answer == 'N'){
            System.out.println("You selected no");
        }else if (answer == 'q' || answer == 'Q'){
            System.out.println("You selected quit");
        }else{
            System.out.println("Invalid selection");
        }
        System.out.println("Using switch statements");
        switch (answer){
            case ('Y'):
                System.out.println("You selected yes ");
                break;
            case 'y':
                System.out.println("You selected yes ");
                break;
            case 'N':
                System.out.println("You selected no");
                break;
            case 'n':
                System.out.println("You selected no");
                break;
            case 'Q':
                System.out.println("You selected quit");
                break;
            case 'q':
                System.out.println("You selected quit");
                break;
            default:
                System.out.println("Invalid selection");
        }
    }
}
