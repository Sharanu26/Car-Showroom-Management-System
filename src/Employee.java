import java.util.Scanner;
import java.util.UUID;
public class Employee extends Showroom implements utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void get_details() {
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Department"+emp_department);
        System.out.println("Showroom_name"+showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("========================= *** ENTER EMPLOYEE DETAILS *** =============================");
        System.out.println();
        System.out.println("EMPLOYEE NAME: ");
        emp_name = sc.nextLine();
        System.out.println("EMPLOYEE AGE: ");
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.println("EMPLOYEE DEPARTMENT: ");
        emp_department = sc.nextLine();
        System.out.println("SHOWROOM DETAILS: ");
        showroom_name = sc.nextLine();
    }
}
