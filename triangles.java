import java.util.Scanner;

public class triangles {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String exit="";
        while (!exit.contains("exit")) {
            System.out.println("Welcome to fun with triangles, please type in what you want to calculate(base, height or area)");
            String select=input.nextLine();
            select=select.toLowerCase();
            System.out.println(select);
            if (select.equals("area") || select.startsWith("a")) {
                System.out.println("insert the base of the triangle");
                double b1=input.nextDouble();
                System.out.println("insert the height of the triangle");
                double h1=input.nextDouble();
                double x=area(b1,h1);
            } else if (select.equals("base") || select.startsWith("b")) {
                System.out.println("insert the area of the triangle");
                double area=input.nextDouble();
                System.out.println("insert the height of the triangle");
                double h1=input.nextDouble();
                double b1=2*area/h1;
                System.out.println("The base of the triangle is " + b1);
            } else if (select.equals("height") || select.startsWith("h")) {
            } else {
                System.out.println("You have to type in \"base\", \"height\" or \"area\" ");
            }
            System.out.println("Press enter to continue, or type exit to quit ");
            exit=input.nextLine();
            exit=exit.toLowerCase();
        }

        }

    public static double area(double b,double h){
        double area = h*b/2;
        System.out.println("The area of the triangle is " + area);
        return area;

    }
}
