public class nested_loops {
    public static void main(String[] args){
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++)
                if (col != row) {
                    System.out.print("Melana ");
                } else {
                    System.out.print("X ");
                }
            System.out.println();
        }
    }
}
