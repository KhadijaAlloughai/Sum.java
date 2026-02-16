import java.util.Scanner;

public class Ticket_Desk {

    public static void main(String[] args) throws InterruptedException{

        Scanner inpt = new Scanner(System.in);


        // Creat an Array
        String [] ticket = new String[5];

        //input                                      
        //store the array data
        ticket [0] = "This is the 1st Ticket";
        ticket [1] = "This is the 2st Ticket";
        ticket [2] = "This is the 3st Ticket";
        ticket [3] = "This is the 4th Ticket";
        ticket [4] = "This is the 5th Ticket";

        //show the array result
        System.out.println(ticket[0]);
        System.out.println(ticket[1]);
        System.out.println(ticket[2]);
        System.out.println(ticket[3]);
        System.out.println(ticket[4]);

        //Modifiy the 2nd data

        ticket [1] = "This is the 2st Ticket after *Modified*";
        System.out.println(ticket[1]);
    }


}
