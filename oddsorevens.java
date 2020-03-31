import java.util.Random;
import java.util.Scanner;

public class oddsorevens {
    public static void main(String[] args) {
        System.out.println("Let's play Odds and Evens. \nWhat is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name + "! Press enter to continue...");
        String start = input.nextLine();
        while (!start.contains("NO")){
            System.out.println("Choose if you want to have (O)dds or (E)vens!");
            String choose = input.nextLine();
            if (choose.startsWith("O")){
                System.out.println("You chosed Odds! The computer will have Evens. \nPut your number now...");
            }else{
                System.out.println("You chosed Evens! The computer will have Odds. \nPut your number now...");
            }
            int unumber = input.nextInt();
            Random rand = new Random();
            int computer = rand.nextInt(6);
            int sum= unumber+computer;
            System.out.println("Computer put: "+computer);
            boolean oddOrEven = sum % 2 == 0;
            if(oddOrEven==true){
                System.out.println("Evens!!");
                if(choose.startsWith("O"))
                    System.out.println("Computer wins!!");
                else{
                    System.out.println("You won!!");
                }
            }else{
                System.out.println("Odds!");
                if(choose.startsWith("O"))
                    System.out.println("You won!!");
                else{
                    System.out.println("Computer wins!!");
                }}
            System.out.println("Press enter to play again or type NO to exit");
            start = input.nextLine();
        }
        //there is a problem: the while won't take a new input before ending and so it will start again since the start variable is initialized empty at the beginning..
    }
    public static void game(){
        Scanner input = new Scanner(System.in);
        int unumber = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        int sum= unumber+computer;
        System.out.println("Computer put: "+computer);
        boolean oddOrEven = sum % 2 == 0;
        if(oddOrEven==true){
            System.out.println("Evens");
        }else{
            System.out.println("Odds");}
    }
}