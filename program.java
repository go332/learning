//Devine formula
//        The Devine formula for calculating ideal body weight in adults is as follows:[8]
//
//        Male ideal body weight = 50 kilograms (110 lb) + 0.9 kilograms (2.0 lb) × (height (cm) − 152)
//        Female ideal body weight = 45.5 kilograms (100 lb) + 0.9 kilograms (2.0 lb) × (height (cm) − 152)
//        Hamwi method
//        The Hamwi method is used to calculate the ideal body weight of the general adult:[9]
//
//        Male ideal body weight = 48 kilograms (106 lb) + 1.1 kilograms (2.4 lb) × (height (cm) − 152)
//        Female ideal body weight = 45.4 kilograms (100 lb) + 0.9 kilograms (2.0 lb) × (height (cm) − 152)

import java.util.Scanner;
public class program {

    public static void main (String[] args){
        intro();
        personalDetails();
    }
    public static void intro(){
        System.out.println("Hello!");
        go();
        System.out.println("Welcome to the ideal body weight calculator!");
        go();
    }
    public static void calculator(){

    }
    public static void personalDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Hi "+name+", what is your current height in cm?");
        double height = input.nextDouble();
        double idealWeight = 45.5 + (0.9 * (height - 152));
        System.out.println("Based on your "+ height+"cm height, your ideal weight is "+ idealWeight + "cm");
    }
    public static void go (){
        Scanner input= new Scanner(System.in);
        System.out.println("Press enter to continue");
        String name = input.nextLine();
    }
}
