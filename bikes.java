import java.util.Scanner;

public class bikes extends showroom
{
    //bike b
    //transmission t
    String bname;
    String bcolor;
    String bfueltype;
    int bprice;
    String btype;
    String bt;

    //override
    public void getdetails()
    {
        System.out.println("Name: "+bname);
        System.out.println("Color: "+bcolor);
        System.out.println("Fuel Type: "+bfueltype);
        System.out.println("Price: "+bprice);
        System.out.println("Bike Type: "+btype);
        System.out.println("Transmission: "+bt);
    }

    //override
    public void setdetails()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Bike Details: ");
            System.out.println();
            System.out.print("Bike Name: ");
            bname = sc.nextLine();
            System.out.print(("Bike Color: "));
            bcolor = sc.nextLine();
            System.out.print("Bike Fuel Type(PETROL/DIESEL): ");
            bfueltype = sc.nextLine();
            System.out.print("Bike Price: ");
            bprice = sc.nextInt();
            sc.nextLine();
            System.out.print("Bike Type(SPORTS/OFFROAD/SCOOTER): ");
            btype = sc.nextLine();
            System.out.print("Transmission Type(AUTOMATIC/MANUAL): ");
            bt = sc.nextLine();
        }
        tbis++;
    }
}
