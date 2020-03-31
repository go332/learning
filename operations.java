import java.util.Scanner;
public class operations {
    public static void main(String[] args){
        double a = 5;
        double b = 3;
        System.out.println("a/b "+ (int)(a/b));
        System.out.println("a%b "+(int)(a%b));
        restofdivision();
    }
    public static void restofdivision(){
        Scanner input = new Scanner(System.in);
        System.out.println("insert a number to be diveded");
        double a = input.nextDouble();
        if(a<5){
            System.out.println("please insert a number bigger than 5");
            a = input.nextDouble();
        }
        System.out.println("insert a number to divide by");
        double b = input.nextDouble();
        var rest = a%b;
        System.out.println("The rest of your division " + rest);
    }
}
