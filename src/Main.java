import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}

public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("=============== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =============");
        System.out.println();
        System.out.println("===================== *** ENTER YOUR CHOICE *** ====================");
        System.out.println();
        System.out.println("1].ADD SHOWRROM DETAILS \t\t\t 2].ADD EMPLOYEE DETAILS \t\t\t 3].ADD CAR DETAILS");
        System.out.println();
        System.out.println("4].GET SHOWROOM DETAILS \t\t\t 5].GET EMPLOYEE DETAILS \t\t\t 6].GET CAR DETAILS");
        System.out.println();
        System.out.println("================================= *** ENTER 0 to EXIT *** =======================");

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employee employee[] = new Employee[5];
        Cars car[] = new Cars[5];
        int car_counter =0;
        int showroom_counter=0;
        int employee_counter=0;
        int choice = 100;
        while(choice!=0){
            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch(choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employee_counter] = new Employee();
                        employee[employee_counter].set_details();
                        employee_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new Cars();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for(int i=0;i<showroom_counter;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for(int i=0;i<employee_counter;i++){
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for(int i=0;i<car_counter;i++){
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHECK: ");
                        break;
                }
            }
        }
    }



}
