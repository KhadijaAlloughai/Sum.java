import java.util.Scanner;

public class Multiplication {



    public class Dashboard {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println(" Enter a number: ");
            int number = input.nextInt();



            for(int i = 1; i <=number; i++){


                System.out.println(" Table  of multiplay by:"+ number);

                for(int j = 1; j <= 10; j++){
                    System.out.println( i + "*"+ j + "=" + (i * j));

                }



            }

        }
    }
}
