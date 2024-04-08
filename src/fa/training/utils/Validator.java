package fa.training.utils;

import java.util.Scanner;

public class Validator {

    public static final String SINGER_NAME_REGEX = "[a-zA-Z ]+";
    public static final String MULTIMEDIA_NAME_REGEX = "[a-zA-Z ]+";

    private static final Scanner sc = new Scanner(System.in);

    public static String stringValidate(String message, String regex){
        String input;
        do {
            System.out.print(message);
            input = sc.nextLine();
            if (!input.matches(regex)) {
                System.out.println("Invalid input, please re-enter".toUpperCase());
            }
        } while (!input.matches(regex));
        return input;
    }

    public static double doubleValidate(String message){
        try{
            System.out.print(message);
            return Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid input for duration, please re-enter".toUpperCase());
            return doubleValidate(message);
        }
    }

    public static Integer intValidate(Integer from, Integer to){
        try{
            System.out.println("Choose function:");
            System.out.println("1. Add a new Video");
            System.out.println("2. Add a new Song");
            System.out.println("3. Show all multimedia");
            System.out.println("4. Exit");
            System.out.print("Your choice:");
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid input, please re-enter value from 1 to 4".toUpperCase());
            return intValidate(from,to);
        }
    }

    public static void main(String[] args) {
        String a = stringValidate("Enter singer: ", SINGER_NAME_REGEX);
        System.out.println(a);
        double b = doubleValidate("Enter duration: ");
    }
}