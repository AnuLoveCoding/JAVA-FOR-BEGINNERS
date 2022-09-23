import java.util.Scanner;


/**
 * checkEvenOdd
 */
public class checkEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

            // int a=3;

        if(a%2==0){

            System.out.println("Number is Even Number");

        }else if(a%2!=0){

            System.out.println("Number is odd Number :");
        }else{
            System.out.println("Wrong Input :");
        }
    }
}