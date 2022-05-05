/*Name: Mohammed Hamed Aljabarti*/
 /*E-mail: MALJABRTY@stu.kau.edu.sa*/
 /*Course number: CPCS-202 */
 /*Section number: D4*/
 /*Assignment title:  Food ordering and delivery Application*/
 /*Date: 2019/10/31 */
package ass2_d4_1935150;

import java.util.Scanner;

public class Ass2_D4_1935150 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Main menu*/
        System.out.println("-----------------------------------------------------------");
        System.out.println("             Welcome                                       ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("a. Food Ordering");
        System.out.println("b. Delivery");
        System.out.println("c. Summary and Exit");
        System.out.print("Please enter your choice: ");

        String option = input.nextLine();
        char x = option.charAt(0);
        double sum = 0;
        while (x != 'a') {
            System.out.println("************ Wrong Entry. Try Again ****************");
            System.out.println("-----------------------------------------------------------");
            System.out.println("             Welcome                                       ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("a. Food Ordering");
            System.out.println("b. Delivery");
            System.out.println("c. Summary and Exit");
            System.out.print("Please enter your choice: ");
            String Woption = input.nextLine();
            x = Woption.charAt(0);
        }

        while (x == 'a') {
            /*Food Menu*/
            System.out.println("-----------------------------------------------------------");
            System.out.println("           Food Menu                                       ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Item                      Price (SR) ");
            System.out.println("1.     Chicken Burger          12 SR ");
            System.out.println("2.     Beef Burger             15 SR ");
            System.out.println("3.     Mac and Cheese          10 SR ");
            System.out.println("4.     Cesar Salad             11 SR ");
            System.out.println("5.     House Salad             10 SR ");
            System.out.println("6.     Fries                    7 SR ");
            System.out.println("7.     Soft Drink               3 SR ");
            System.out.println("Enter your choice (1 to 7) or -1 to exit: ");
            int choise = input.nextInt();
            while (choise > 7 && choise < 0 && choise != -1) {
                System.out.println("Enter your choice (1 to 7) or -1 to exit: ");
                choise = input.nextInt();
            }

            if (choise <= 7 && choise >= 1) {
                System.out.println("Enter quantities:");
                int quantities = input.nextInt();
                while (quantities == 0) {
                    System.out.println("Enter quantities:");
                    quantities = input.nextInt();
                }

                switch (choise) {
                    case 1:
                        sum = quantities * 12 + sum;
                        break;
                    case 2:
                        sum = quantities * 15 + sum;
                        break;
                    case 3:
                        sum = quantities * 10 + sum;
                        break;
                    case 4:
                        sum = quantities * 11 + sum;
                        break;
                    case 5:
                        sum = quantities * 10 + sum;
                        break;
                    case 6:
                        sum = quantities * 7 + sum;
                        break;
                    case 7:
                        sum += quantities * 3 + sum;
                        break;
                }
            } /*Choises*/ else if (choise == -1) {
                System.out.println("The total price of the order: " + sum);
                break;
            }
        }
        /*Wrong option .. delivery*/
        option = input.nextLine();
        while (x != 'b') {

            System.out.println("-----------------------------------------------------------");
            System.out.println("             Welcome                                       ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("a. Food Ordering");
            System.out.println("b. Delivery");
            System.out.println("c. Summary and Exit");
            System.out.print("Please enter your choice: ");
            option = input.nextLine();
            x = option.charAt(0);
        }
        /*Start .. delivery*/
        while (x == 'b') {
            System.out.print("Enter your full name (first and lastname): ");
            String FullName = input.next();
            System.out.print("Enter your phone number: ");
            String phonenumber = input.next();
            char p = phonenumber.charAt(0);
            while (phonenumber.length() < 10 || phonenumber.length() > 10) {
                System.out.println("Wrong Phone number. Enter again..");
                System.out.println("Enter your phone number: ");
                phonenumber = input.next();
                p = phonenumber.charAt(0);
            }

            while (phonenumber.length() == 10) {
                System.out.println("Fill in your address information: ");
                break;
            }
            System.out.print("Enter building number: ");
            String buildingnumber = input.next();
            System.out.print("Enter street name: ");
            String StreetName = input.next();
            System.out.print("Enter city: ");
            String CityName = input.next();
            System.out.print("Enter zip code: ");
            String zip = input.next();
            char z = zip.charAt(0);
            while (zip.length() < 5 || zip.length() > 5) {
                System.out.println("Wrong zip code. Enter again..");
                System.out.print("Enter your zip code: ");
                zip = input.next();
                z = zip.charAt(0);
            }
            while (zip.length() == 5) {
                System.out.print("Enter coupon code (if any):");
                String code = input.next();
                x = code.charAt(0);
                if (code.equals("FXER05")) {
                    sum = (sum) - (sum * (0.05));

                    System.out.println("***********Thank you. We will deliver your order shortly*************");
                } else if (code.equals("FXER10")) {
                    sum = (sum) - (sum * (0.10));

                    System.out.println("***********Thank you. We will deliver your order shortly*************");
                } else if (code.equals("FXER15")) {
                    sum = (sum) - (sum * (0.15));

                    System.out.println("***********Thank you. We will deliver your order shortly*************");
                } else if (code.equals("FXER20")) {
                    sum = (sum) - (sum * (0.15));

                    System.out.println("***********Thank you. We will deliver your order shortly*************");
                }
                break;
            }
            option = input.nextLine();
            while (x != 'c') {

                System.out.println("-----------------------------------------------------------");
                System.out.println("             Welcome                                       ");
                System.out.println("-----------------------------------------------------------");
                System.out.println("a. Food Ordering");
                System.out.println("b. Delivery");
                System.out.println("c. Summary and Exit");
                System.out.print("Please enter your choice: ");
                option = input.nextLine();
                x = option.charAt(0);
            }
            /*Start .. delivery*/
            while (x == 'c') {
                System.out.println("-----------------------------------------------------------");
                System.out.println("                       Summary                             ");
                System.out.println("-----------------------------------------------------------");
                System.out.println("Your full name is: " + FullName);
                System.out.println("Your phone number is: " + phonenumber);
                System.out.println("Your total order is: " + sum);
                break;
            }
            break;
        }

    }/*public static*/
}/*public class*/
