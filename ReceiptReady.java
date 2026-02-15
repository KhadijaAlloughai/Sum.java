import java.util.Scanner;

public class ReceiptReady {

    public static void main(String[] args) throws InterruptedException{


        Scanner scanRR = new Scanner(System.in);

        System.out.println("Enter your ITEMS Number: ");
        int itemsNum = scanRR.nextInt();


        scanRR.nextInt();


        int counter = 1;

        while (counter <= itemsNum){

            String itemsname = scanRR.nextLine();
            System.out.println("Enter your ITEMS Name: ");
            scanRR.nextInt();

            double receipt = scanRR.nextDouble();
            System.out.println("Enter your ITEMS price: ");
            scanRR.nextLine();


            counter++;
        }

    }


}
