import java.util.Scanner;

//Uper camel case
public class Ticket {
    public static void main(String[] args) {

        //Declaration:
        Scanner scanInput = new Scanner(System.in);

        int startnumber = 5;
        int endnumber = 1;


        // Input

        while (endnumber <= startnumber) {
            System.out.println("Please enter your ticket number: "+ endnumber);
            String ticketNumber1 = scanInput.nextLine();
//             System.out.println("Please enter your ticket number: ");
//             String ticketNumber2 = scanInput.nextLine();
//             System.out.println("Please enter your ticket number: ");
//             String ticketNumber3 = scanInput.nextLine();


            //process
            String dummyStatus = "pending";

            //  char ticketNumberOne = '9';


            //output
            System.out.printf("The complain status of ticket %s is %s\n ", ticketNumber1, dummyStatus);
            // System.out.printf("The complain status of ticket %s is %s\n ", ticketNumber2, dummyStatus);
            //System.out.printf("The complain status of ticket %s is %s\n ", ticketNumber3, dummyStatus);


            endnumber = endnumber+1;// start from 5,4.3,2,1
        }


        System.out.println(" Ending the Execulion***");
    }
}