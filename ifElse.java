import java.util.Scanner;

/**
 * ifElse
 */
public class ifElse {

    public static void main(String[] args) {



//         String weather = "rain";

//         if(weather =="rainy"){
//             System.out.println("Take an umbrella ");

//         }else if(weather == "sunny"){
//            System.out.println("wear sunglass");
//         }else{
//             System.out.println("check weather forecast");
//         }

        Scanner sc= new Scanner(System.in);

        int x= sc.nextInt();

        if(x>0){
            System.out.println("Positive");
        }else if(x<0){
            System.out.println("Negative");
        }else{
            System.out.println("wrong Input");
        }

    }
}