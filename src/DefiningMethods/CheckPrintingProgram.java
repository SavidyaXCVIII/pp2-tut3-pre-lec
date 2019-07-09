package DefiningMethods;

import java.util.Scanner;

public class CheckPrintingProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter a number between 1 - 999");
        do {
            while (!input.hasNextInt()){
                System.out.println("Enter a number between 1 - 999");
                input.next();
            }
            number = input.nextInt();
        }while (number < 0 || number > 999);
        System.out.println(getNumberInWords(number));
    }

    private static String getNumberInWords(int number){

        String word = String.valueOf(number);
        int length = String.valueOf(number).length();
        String wording = "";
        int firstDigit = Character.getNumericValue(word.charAt(0));


        if(length == 1){

            wording = getOneToNine(number);
        }
        else if(length == 2 ){

            if(firstDigit == 1){
                wording = getTeens(Character.getNumericValue(word.charAt(1)));
            } else {

                wording = getTens(firstDigit) + " " + getOneToNine(Character.getNumericValue(word.charAt(1)));
            }
        } else if(length == 3) {

            wording = getOneToNine(Character.getNumericValue(word.charAt(0))) + " hundred";

            if(Character.getNumericValue(word.charAt(1)) != 0 || Character.getNumericValue(word.charAt(2)) != 0 ){

                wording += " and ";
            }

            if(Character.getNumericValue(word.charAt(1)) == 1){
                wording += getTeens(Character.getNumericValue(word.charAt(2)));
            } else {

                wording += getTens(Character.getNumericValue(word.charAt(1))) + " " + getOneToNine(Character.getNumericValue(word.charAt(2)));
            }
        }
        return wording;
    }

    private static String getOneToNine(int digit){

        String word = "";

        switch (digit){

            case 1 : word = "one";
                    break;
            case 2 : word = "two";
                break;
            case 3 : word = "three";
                break;
            case 4 : word = "four";
                break;
            case 5 : word = "five";
                break;
            case 6 : word = "six";
                break;
            case 7 : word = "seven";
                break;
            case 8 : word = "eight";
                break;
            case 9 : word = "nine";
                break;
        }
        return word;
    }

    private static String getTeens(int digit){

        String word;

        switch (digit){

            case 1 : word = "eleven";
                break;
            case 2 : word = "twelve";
                break;
            case 3 : word = "thirteen";
                break;
            case 4 : word = "fourteen";
                break;
            case 5 : word = "fifteen";
                break;
            case 6 : word = "sixteen";
                break;
            case 7 : word = "seventeen";
                break;
            case 8 : word = "eighteen";
                break;
            case 9 : word = "nineteen";
                break;
             default: word = "ten";
        }
        return word;
    }

    private static String getTens(int digit){

        String word;

        switch (digit){

            case 2 : word = "twenty";
                break;
            case 3 : word = "thirty";
                break;
            case 4 : word = "forty";
                break;
            case 5 : word = "fifty";
                break;
            case 6 : word = "sixty";
                break;
            case 7 : word = "seventy";
                break;
            case 8 : word = "eighty";
                break;
            case 9 : word = "ninety";
                break;
            default: word = "";
        }
        return word;
    }
}
