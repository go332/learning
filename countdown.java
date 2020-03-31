public class countdown {
    public static void main(String[] args){
        int x =5;
        for(int i=x;i>=0;i--){
            System.out.println(i);
        }
        countdown(x);
        System.out.print(countdown(x)+",0");
    }
    public static String countdown(int x){
         if (x==1) {
            return "1";
        }else {
            return x+","+countdown(x-1);
        }
    }
}
