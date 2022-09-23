import java.util.Scanner;

import javax.sound.midi.Soundbank;

/**
 * checkEvenOdd
 */
public class checkEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();


        if(a%2==0){

            System.out.println("Number is Even :"  );

        }else if(a%2!=0){

            System.out.println("Number is odd :");
        }else{
            System.out.println("Wrong Input :");
        }
    }
}