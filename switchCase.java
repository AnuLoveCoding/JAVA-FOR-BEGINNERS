import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        
            // int day = 1;
            // String weather = "rainy";

            // switch (weather) {
            //         case "rainy" : System.out.println("Take the umbrella");

            //         break;

            //        case "sunny" :System.out.println("Wear the sunglass");
            //        break;
            //        case "rose": System.out.println("freedom");
            //        break;

            //        default: System.out.println("Check the forecast");


            // }
                  
                         Scanner sc= new Scanner(System.in);

                         int  months = sc.nextInt();
                          
                //    int months = 8;

                        //   Break are very important in SwitchCase;

                   switch(months){
                       case 1: System.out.println("January");
                       System.out.println("Days 31");
                       break;
                       case 2: System.out.println("February");
                       System.out.println("Days 28 or 29");
                       break;
                       case 3 : System.out.println("March");
                       System.out.println("Days 31");
                       break;
                       case 4: System.out.println("April");
                       System.out.println("Days 30");
                       break;
                       case 5 : System.out.println("May");
                       System.out.println("Days 31");
                       break;
                       case 6: System.out.println("June");
                       System.out.println("Days 30");
                       break;
                       case  7: System.out.println("July");
                       System.out.println("Days 31");
                                            break;
                       case 8 : System.out.println("August");
                            System.out.println("Days 31");
                            break;
                            case 9 : System.out.println("September");
                            System.out.println("Days 30");
                            break;
                            case 10 :System.out.println("October");
                            System.out.println("Days 31");
                            break;
                            case 11 :System.out.println("NOvemver");
                            System.out.println("Days 30");
                            break;
                            case 12 :System.out.println("December");
                            System.out.println("Days 31");
                            break;
                            default:System.out.println(" Wrong Input");

                   }

}
}
