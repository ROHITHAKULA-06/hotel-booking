/**
 *
 * @author rohit
 */
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;
class food
{int amt=0;
Scanner sc=new Scanner(System.in);
   food()
{
}
 void foodmethod()
    {
    int ch;
     int qty;
     System.out.println("select ur preference \n   1.veg \n   2.non-veg");
    ch=sc.nextInt();
    /*String ch2;
    ch2=sc.next();*/
    switch(ch)
    {
        case 1:
            System.out.println("                       menu                            ");
            System.out.println("    1.dosa");
            System.out.println("    \n2.idly");
            System.out.println("    \n3.vada sambar");
            System.out.println("    \n4.poori");
            System.out.println("    \n5.chappati \n  currys  \n    1.kaju  \n2.mixed veg   3.dal \n    4.panner");
            System.out.println("    \n6.butter nan \n  currys  \n    1.kaju  \n2.mixed veg   3.dal \n    4.panner");
            System.out.println("    \n7.fried rice");
            int ch3;
            ch3=sc.nextInt();
            switch(ch3)
            {
                case 1:
                    System.out.println("enter the type u want (1.masala dosa/2.plain)");
                    int chd;
                    chd=sc.nextInt();
                    switch(chd)
                    {
                        case 1:
                            System.out.println("enter the qty");
                            qty=sc.nextInt();
                            amt+=qty*130;
                            break;
                        case 2:
                            System.out.println("enter the quantity u want");
                            qty=sc.nextInt();
                            amt+=qty*100;
                            break;
                            default :
            System.out.println("invalid choice");
                    }break;
                case 2:
                    System.out.println("enter the no of plates u want");
                    qty=sc.nextInt();
                    amt+=qty*70;
                    break;
                case 3:
                    System.out.println("enter the number of plates u want");
                    qty=sc.nextInt();
                    amt+=qty*85;
                    break;
                case 4:
                    System.out.println("you have select poori enter the number of plates u want");
                    qty=sc.nextInt();
                    amt+=qty*100;
                    break;
                case 5:
                    System.out.println("you've selected chapati enter quantity");
                    qty=sc.nextInt();
                    int curry;
                    System.out.println("enter the curry u want \n    curry   \n\n1.kaju\n2.mixed veg\n3.dal \n4.panner");
                    curry=sc.nextInt();
                    switch(curry)
                    {
                        case 1:
                        curry=100;
                        break;
                        case 2:
                        curry=125;
                        break;
                        case 3:
                        curry=130;
                        break;
                        case 4:
                        curry=150;
                        break;
                        default:
                        System.out.println("invalid choice");
                    }
                    amt+=qty*65+curry;
                    break;
                    case 6:
                    System.out.println("you've selected butter naun enter quantity and curry u want");
                    qty=sc.nextInt();
                    System.out.println("enter the curry u want \n    curry   \n\n1.kaju\n2.mixed veg\n3.dal \n4.panner");
                    curry=sc.nextInt();
                    switch(curry)
                    {
                        case 1:
                        curry=100;
                        break;
                        case 2:
                        curry=125;
                        break;
                        case 3:
                        curry=130;
                        break;
                        case 4:
                        curry=150;
                        break;
                        default:
                        System.out.println("invalid choice");
                    }
                    amt+=qty*65+curry;
                    break;
                    case 7:
                        System.out.println("ENTER THE QUTY U WANT");
                        qty=sc.nextInt();
                        amt+=qty*170;
                        break;
                        default :
            System.out.println("invalid choice");
}
            break;
        case 2:
            System.out.println("         menu          ");
            System.out.println("     1.chicken friedrice");
            System.out.println("     2.chicken biriyani");
            System.out.println("     3.chicken burger");
            int c;
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("you've selected chicken friedrice");
                    System.out.println("price is :250");
                    System.out.println("enter the quantity u want");
                    qty=sc.nextInt();
                    amt+=qty*250;
                    break;
                case 2:
                    System.out.println("you've selected chicken biriyani");
                    System.out.println("price is :275");
                    System.out.println("enter the quantity u want");
                    qty=sc.nextInt();
                    amt+=qty*275;
                    break;
                case 3:
                    
                    System.out.println("you've selected chicken burger");
                    System.out.println("price is :350");
                    System.out.println("enter the quantity u want");
                    qty=sc.nextInt();
                    amt+=qty*275;
                    break;
                default :
                    System.out.println("invalid choice");
            }
            break;
        default :
            System.out.println("invalid choice");
    }
}
}
class person extends food
{
    Scanner sc=new Scanner(System.in);
    String pname,paddr="";
    void details()
    {
        System.out.println("enter the name of the person");
        pname=sc.next();
        System.out.println("enter the address of the person");
        System.out.println("NOTE:enter '.' if the address is completed\n");
        while(true)
        {
        paddr+=sc.next()+" ";
        if(paddr.contains("."))
            break;
        }
    }
}
class room extends person
{
    int ant=0;
   int delux,luxary,n,chr;
   int l1,l2,d1,d2;
   void ro()
   {
       System.out.println("welcome to motel");
       System.out.println("available rooms are:");
       System.out.println("  1.delux single bed   :₹800/-");
       System.out.println("  2.delux double bed   :₹1500/-");
       System.out.println("  3.luxury single bed  :₹1950/-");
       System.out.println("  4.luxury double bed  :₹2250/-");
       System.out.println("enter ur choice:");
       chr=sc.nextInt();
       switch(chr)
       {
           case 1:
               delux=800;
               deluxbill();
               break;
           case 2:
               delux=1500;
               deluxbill();
               break;
       case 3:
               luxary=1950;
               luxarybill();
               break;
       case 4:
               luxary=2250;
               luxarybill();
               break;
       default:
           System.out.println("invalid choice");
       }
   }
   void deluxbill()
   {
       System.out.println("enter the number of rooms u want");
       n=sc.nextInt();
       ant+=n*delux;
       if(delux==800)
           d1=n;
       else
           d2=n;
   }
   void luxarybill()
   {
       System.out.println("enter the number of rooms u want");
       n=sc.nextInt();
       ant+=n*luxary; 
       if(delux==800)
           l1=n;
       else
           l2=n;
   }
}
class checkout extends room
{
    int aa;
    double bill,tax;
checkout()
{
}
    void check(int x)
    {
    System.out.println("\nname of the person is:"+pname);
    System.out.println("\nadderss of the person is:"+paddr);
    if(d1!=0)
    System.out.println("\nnumber of delux single bed room :"+d1);
    if(d2!=0)
    System.out.println("\nnumber of delux double bed room :"+d2);
    if(l1!=0)
    System.out.println("\nnumber of luxary single bed room :"+l1);
    if(l2!=0)
    System.out.println("\nnumber of luxary double bed room :"+l2);
    System.out.println("\nroom bill is :"+ant);
    System.out.println("\nfood bill is :"+x);
    bill=ant+x;
    tax=bill*0.025f;
    System.out.println("\n       tax      :"+tax);
    System.out.println("\nmaintanence fee : 250");
    double tbill=x+aa+tax;
    System.out.println("\ntotal bill is :"+(tbill+500));
    }
}
public class hotel {
    public static void main(String args[]) throws IOException{
        // TODO code application logic here    public static void main(String args[])
    { String choice;
    int input;
        checkout c=new checkout();
          c.details(); 
          food ff=new food();
          do
          {
          System.out.println("press 1.for motel booking or to order food press 2");
          input=c.sc.nextInt();
          if(input==1)
          c.ro();
          else if(input==2)
              do
              {
        ff.foodmethod();
        System.out.println("do you want to order more food if u want to enter \"yes\"");
        choice=c.sc.next();
              }while(choice.equalsIgnoreCase("yes"));
          else
              System.out.println("invalid input");
            System.out.println("enter \"yes\" if you wish to continue");
        choice=c.sc.next();
        }while(choice.equalsIgnoreCase("yes"));
Scanner s=new Scanner(System.in);
System.out.println("Hai");
        c.check(ff.amt);
    System.out.println("\n\n\t\tenter the number of bill or the name you want to save this bill as");
    String n=s.next();
    String name=n+".txt";
    PrintWriter out = new PrintWriter(name);
    out.println("         details            ");
    out.println("name of the person is:"+c.pname);
    out.println("adderss of the person is:"+c.paddr);
    out.println("        total bill             ");
    out.println("room bill is :"+c.ant);
    out.println("food bill is :"+ff.amt);
    out.println("maintanence fee : 500");
    double tbill=c.ant+c.aa+c.tax;
    out.println("total bill is :"+(tbill+500));
    out.println("thank you for staying in our motal");
    out.println("hope u enjoyed in our motal");
    out.println("hope u vist again");
    out.close(); 
    }
    }   
}