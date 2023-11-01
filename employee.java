import java.util.Scanner;
import java.util.UUID;


public class employee extends showroom{
    //employee emp
    //department dep
    String empid;
    String empname;
    int empage;
    String empdep;

    //override
    public void getdetails()
    {
        System.out.println("Employee ID: "+empid);
        System.out.println("Name: "+empname);
        System.out.println("Age: "+empage);
        System.out.println("Department: "+empdep);
        System.out.println("Showroom Name: "+srname);
    }

    //override
    public void setdetails(){
        UUID uuid = UUID.randomUUID();
        try (Scanner sc = new Scanner(System.in)) {
            empid = String.valueOf(uuid);
            System.out.println("Enter Employee Detail: ");
            System.out.println();
            System.out.print("Employee Name: ");
            empname = sc.nextLine();
            System.out.print(("Employee Age: "));
            empage = sc.nextInt();
            sc.nextLine();
            System.out.print("Employee Department: ");
            empdep = sc.nextLine();
            System.out.print("Showroom Name: ");
            srname = sc.nextLine();
        }
    }
}

