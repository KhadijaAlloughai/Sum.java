import java.util.Scanner;

public class StudentInfoShowcase {


    public static void main(String[] args){


        Scanner inputUser = new Scanner(System.in);


        System.out.println("Enter number of students: ");
        int std = inputUser.nextInt();


        for(int i = 1; i <= std; i ++){

            System.out.println("Enter  student Name: ");
            String stdName = inputUser.nextLine();
            inputUser.nextLine();

            System.out.println("Enter  student Age: ");
            int stdAge = inputUser.nextInt();

            inputUser.nextLine();// clean buffer
            System.out.println("Enter  student Grade: ");
            int stdGrade = inputUser.nextInt();

            inputUser.nextLine();

        }

        System.out.println("Thats all.. ");

    }
}
