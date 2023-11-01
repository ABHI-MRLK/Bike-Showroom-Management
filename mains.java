import java.util.*;

interface utility{
    public void getdetails();
    public void  setdetails();
}

public class mains
{
    static void mainmenu()
    {
        System.out.println();
        System.out.println("Welcome to Showroom Management System");
        System.out.println();
        System.out.println("Enter Your Choice: ");
        System.out.println();
        System.out.println("1]ADD SHOWROOMS \n2]ADD EMPLOYEES \n3]ADD BIKES");
        System.out.println("4]GET SHOWROOMS \n5]GET EMPLOYEES \n6]GET BIKES \n7]TYPE 0 FOR EXIT \n");
    }

    public static void main(String args [])
    {
        try (Scanner sc = new Scanner(System.in)) {
            showroom shroom[]=new showroom[7];
            employee emp[]=new employee[7];
            bikes bike[]=new bikes[7];

            int bcount=0;
            int srcount=0;
            int empcount=0;
            int ch=69;

            while(ch!=0)
            {
                mainmenu();
                ch=sc.nextInt();

                while(ch!=9 && ch!=0){
                    switch (ch) {
                        case 1:
                            shroom[srcount] = new showroom();
                            shroom[srcount].setdetails();
                            srcount++;
                            System.out.println();
                            System.out.println("1]ADD NEW SHOWROOM");
                            System.out.println("9]GO BACK TO MAIN MENU");
                            ch = sc.nextInt();
                            break;
                        case 2:
                            emp[empcount] = new employee();
                            emp[empcount].setdetails();
                            empcount++;
                            System.out.println();
                            System.out.println("2]ADD NEW EMPLOYEE");
                            System.out.println("9]GO BACK TO MAIN MENU");
                            ch = sc.nextInt();
                            break;
                        case 3:
                            bike[bcount] = new bikes();
                            bike[bcount].setdetails();
                            bcount++;
                            System.out.println();
                            System.out.println("3]ADD NEW BIKE");
                            System.out.println("9]GO BACK TO MAIN MENU");
                            ch = sc.nextInt();
                            break;
                        case 4:
                            for (int i = 0; i < srcount; i++) {
                                shroom[i].getdetails();
                                System.out.println();
                                System.out.println();
                            }
                            System.out.println();
                            System.out.println("9]GO BACK TO MAIN MENU");
                            System.out.println("0]EXIT");
                            ch = sc.nextInt();
                            break;
                        case 5:
                            for (int i = 0; i < empcount; i++) {
                                emp[i].getdetails();
                                System.out.println();
                                System.out.println();
                            }
                            System.out.println();
                            System.out.println("9]GO BACK TO MAIN MENU");
                            System.out.println("0]EXIT");
                            ch = sc.nextInt();
                            break;
                        case 6:
                            for (int i = 0; i < bcount; i++) {
                                bike[i].getdetails();
                                System.out.println();
                                System.out.println();
                            }
                            System.out.println();
                            System.out.println("9]GO BACK TO MAIN MENU");
                            System.out.println("0]EXIT");
                            ch = sc.nextInt();
                            break;
                        default:
                            System.out.println("ENTER VALID CHOICE: ");
                            break;
                    }
                }
            }
        }
    }
}
