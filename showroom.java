import java.util.Scanner;

public class showroom implements utility{
    //showroom -sr
    //address addr
    //employee emp
    //total bikes instock tcis
    //managername manname
    String srname;
    String sraddr;
    int totalemp;
    int tbis;
    String manname;

    //Override
    public void getdetails()
    {
        System.out.println("Showroom Name: "+srname);
        System.out.println("Showroom Address: "+sraddr);
        System.out.println("Manager Name: "+manname);
        System.out.println("Total Employees: "+totalemp);
        System.out.println("Total bikes in stock: "+tbis);
    }
    //override 
    public void setdetails()
    {
        System.out.println("Enter ShowRoom Details: ");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n");
            System.out.println("Showroom Name: ");
            srname=sc.nextLine();
            System.out.println("Showroom Address: ");
            sraddr=sc.nextLine();
            System.out.println("Manager Name: ");
            manname=sc.nextLine();
            System.out.println("Total no of employees");
            totalemp=sc.nextInt();
            System.out.println("Total bikes in stock: ");
            tbis=sc.nextInt();
        }
    }

}
