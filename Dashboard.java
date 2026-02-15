import java.net.SocketOption;
import java.util.Scanner;

public class Dashboard {
    public static void main(String[] args){




        System.out.println("Enter a number for  \r mulitply: ");
       Scanner inputBuffer2 = new Scanner(System.in);
       int num2 = inputBuffer2.nextInt();



//
        System.out.println("The result= ");
//        System.out.println("1 * "+ num2 + "="+ (1 *  num2));
//        System.out.println("2 * "+ num2 + "="+ (2 *  num2));
//        System.out.println("3 * "+ num2 + "="+ (3 *  num2));
//        System.out.println("4 * "+  num2 + "="+( 4 *  num2));
//        System.out.println("5 * "+ num2 + "="+(5 *  num2));
//        System.out.println("6 * "+ num2 +"="+(6 *  num2));
//        System.out.println("7 * "+ num2+ "="+(7 *  num2));
//        System.out.println("8 * "+  num2+ "="+(8 *  num2));
//        System.out.println("9 * "+  num2+"="+ (9 *  num2));
//        System.out.println("10 * "+ num2+  "="+(10 *  num2));




        for(int i=1; i <=10; i++){

            //System.out.println(i);
            System.out.printf(  i +" * "+ num2 + " = "+ "" + (i *  num2));

        }






    }
}
