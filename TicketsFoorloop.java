import java.util.Scanner;

public class TicketsFoorloop  {


    public static void main(String[] args) throws InterruptedException{



        Scanner inputUser = new Scanner(System.in);

        //Declare
        int num = 3;
        for( int i = 0, k = 8, w = 5; i <=  15; --k, i++){

            System.out.printf("processed ticket %d \n", ++i);
            System.out.println( " k = "+ k);
            System.out.println( " w = "+ w);
            Thread.sleep(1000);
        }




    }
}
