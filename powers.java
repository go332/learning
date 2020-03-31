public class powers {
    public static void main(String[] args){
        int x=5;
        int power =1;
        for (int i=1; i<=4;i++){
        power*=x;
        System.out.println(power);}
        elevated2();
        nelevatedn();
    }
    public static void elevated2(){
        for (int i=1;i<10; i++){
            int result=i*i;
            System.out.println(i+"elevated 2="+result);
        }
    }

    public static void nelevatedn(){
        for(int j=1;j<10;j++){
            int power=1;
                for (int i=1;i<10; i++){
                    power=power*j;
                    System.out.print(i+" "+j+" "+power+"   ");
                }
            System.out.println();
        }
    }
}
