import java.util.Scanner;

public class funwithstrings {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String play="";
        while (play.isEmpty() || play.contains("yes")){
            string();
            System.out.println("Press enter to try again");
            play=input.nextLine();
        }
    }
    public static void string(){
        System.out.println("Enter a name");
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();
        System.out.println((word.toLowerCase()+word.toUpperCase()).repeat(10));
        System.out.println((word.toUpperCase()+word.toLowerCase()).repeat(10));
        word=word.toUpperCase();
        for (int i = 0; i < word.length(); i++) {
                char x = word.charAt(i);
                int ind = word.indexOf(x);
                System.out.println(x);
        }
        System.out.println((word.toLowerCase()+word.toUpperCase()).repeat(10));
        System.out.println((word.toUpperCase()+word.toLowerCase()).repeat(10));
        System.out.println();
        int x=factorial(word.length());
        System.out.println(word+" is a combination of " + word.length()+" letters out of " +x+" combinations");
        System.out.println(x);
        //what about combinations without repetions ?
        String mirror="";
        for(int i=1; i<=word.length();i++){
            mirror +=word.charAt(word.length()-i);
        }
        System.out.println();
        System.out.println(mirror);
        System.out.println();
        System.out.println((word.toLowerCase()+word.toUpperCase()).repeat(10));
        System.out.println((word.toUpperCase()+word.toLowerCase()).repeat(10));
        System.out.println();
        System.out.println(word.substring(0,2)+word.charAt(1)+word.charAt(1)+word.charAt(1));
        System.out.println(word.substring(2));
        //write the name without vocals
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++)
                if (col != row) {
                    System.out.print(word);
                } else {
                    System.out.print("  X   ");
                }
            System.out.println();
        }
        countdownx(word.length());
        System.out.println(countdownx(word.length()));
    }

    public static int factorial(int x){
        if(x==1){
           return 1;
        }else{
            return x*factorial(x-1);
        }
    }
    public static String countdownx(int x){
        if (x==1){
            return "1";
        }else{
            return x+","+countdownx((x-1));
        }
    }
}
