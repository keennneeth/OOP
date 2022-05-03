
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.FileWriter;
import java.util.Scanner;
import java.text.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Main 
{
    public static void main(String args[]){
        String[] gui = { "Exit", "Create Account", "Log in"};
        int selection = 2;

        while(selection !=0){
            selection = JOptionPane.showOptionDialog(null, "Fruit Store, Choose your option",null,JOptionPane.PLAIN_MESSAGE,0,null,gui,gui[2]);
            switch(selection)
            {
                case 2:

                int selection1 = 1;
                String[] gui1 = {"Exit" , "Log in"};
                String loginu = JOptionPane.showInputDialog("Username:");
                String loginp = JOptionPane.showInputDialog("Password:");


                loginu=loginu.trim();
                loginp=loginp.trim();
                String x= loginu+" "+loginp;
                String p= loginu+"-----"+ loginp;


         
         
                try {
                     
                    File f = new File("newtest.txt");
                    Scanner content = new Scanner(f);
                    int flag=0;
                    while (content.hasNextLine()) {
                      String data = content.nextLine();
                      if(data.equals(x))
                      {


                        double Banana = 0.33;
                        double Apple = 0.25;
                        double Orange = 0.15;
                        double pear = 0.45;





                        int banmax = 15;
                        int applemax = 10;
                        int orangemax = 10;
                        int pearmax = 15;

                        double totalb, totala, totalo, totalp, grandtotal=0;


                        String[] gui3 = { "Exit", "Banana", "Apple", "Orange", "Pear", "Checkout", "Check Stock", "View Order"};
                        int selection3 = 7;
                        
                        while(selection3 !=0){
                        selection3 = JOptionPane.showOptionDialog(null, "Supplier Store / what would you like?","Fruit Store",JOptionPane.PLAIN_MESSAGE,0,null,gui3,gui3[7]);
                        switch(selection3)
                        {                
                        case 0:
                        System.exit(0);
                        break;

                        case 1:
                        int bananaquantity = Integer.parseInt(JOptionPane.showInputDialog("How many bananas would you like?    Available: " + banmax));
                        if (banmax < bananaquantity)
                        {
                            JOptionPane.showMessageDialog(null,("You have exceeded the limit"));

                        }

                        else
                        {
                        banmax -= bananaquantity;
                        totalb = bananaquantity*Banana;
                        grandtotal += totalb;
                        JOptionPane.showMessageDialog(null, bananaquantity + " Banana(s) were added to your cart" +", the total for banana(s) is $" + totalb);

                        
                        
                        
                  int flag1=0;
                  String x1= bananaquantity+" "+totalb;
                  if(bananaquantity < banmax)
                  {
                       
                        File f1 = new File("orders.txt");
                  }
                  if(flag==0)
                      {
                          try{
                            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy/ HH:mm:ss");
                            Date today = Calendar.getInstance().getTime();        
                            String date= dateFormat .format(today);
                              BufferedWriter out = new BufferedWriter(new FileWriter("orders.txt", true)); 
                              out.write("\n" +loginu + "  -- Banana:" + bananaquantity+" Price $"+x1 +" Ordered on " + today);
                              out.close();
                          }
                          catch (IOException o) {
                              System.out.println("exception occoured" + o);
                          }
                      }

                        }

                        break;

                        

                        case 2:
                        int Appleuantity = Integer.parseInt(JOptionPane.showInputDialog("How many apple(s) would you like?    Available: " + applemax));
                        if (applemax < Appleuantity)
                        {
                            JOptionPane.showMessageDialog(null,("You have exceeded the limit"));

                        }
                        else
                        {
                        applemax -= Appleuantity;
                        totala = Appleuantity*Apple;
                        DecimalFormat appleprice = new DecimalFormat("#.##");
                        JOptionPane.showMessageDialog(null, Appleuantity + " Apple(s) were added to your cart" +", the total for Apple(s) is $" + appleprice.format(totala));
                        grandtotal += totala;

                                
                  int flag2=0;
                  String x1= Appleuantity+" "+totala;
                  if(Appleuantity == Appleuantity)
                  {
                       
                        File f1 = new File("orders.txt");
                  }
                  if(flag==0)
                      {
                          try{
                            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy/ HH:mm:ss");
                            Date today = Calendar.getInstance().getTime();        
                            String date= dateFormat .format(today);

                              BufferedWriter out = new BufferedWriter(new FileWriter("orders.txt", true)); 
                              out.write("\n" +loginu + "  -- Apple:" + Appleuantity+" Price $"+totala +" Ordered on " + today);
                              out.close();
                          }
                          catch (IOException o) {
                              System.out.println("exception occoured" + o);
                          }
                      }

                    }

                    
                        break;

                        case 3:
                        int OrangeQuantity = Integer.parseInt(JOptionPane.showInputDialog("How many oranges(s) would you like?    Available: "+orangemax));
                        if (orangemax < OrangeQuantity)
                        {
                            JOptionPane.showMessageDialog(null,("You have exceeded the limit"));


                        }
                        else
                        {
                        orangemax -= OrangeQuantity;
                        totalo = OrangeQuantity*Orange;
                        DecimalFormat orangeprice = new DecimalFormat("#.##");
                        JOptionPane.showMessageDialog(null, OrangeQuantity + " Orange(s) were added to your cart" +", the total for oranges(s) is $" + orangeprice.format(totalo));
                        grandtotal += totalo;


                                
                  int flag1=0;
                  String x1= OrangeQuantity+" "+totalo;
                  if(OrangeQuantity == OrangeQuantity)
                  {
                       
                        File f1 = new File("orders.txt");
                  }
                  if(flag==0)
                      {
                          try{

                            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy/ HH:mm:ss");
                            Date today = Calendar.getInstance().getTime();        
                            String date= dateFormat .format(today);
                              BufferedWriter out = new BufferedWriter(new FileWriter("orders.txt", true)); 
                              out.write("\n" +loginu + "  -- Oranges:" + OrangeQuantity+" Price $"+totalo +" Ordered on " + today);
                              out.close();
                          }
                          catch (IOException o) {
                              System.out.println("exception occoured" + o);
                          }
                      }

                        }

                        
                        break;

                        case 4:
                        int pearquantity = Integer.parseInt(JOptionPane.showInputDialog("How many pears(s) would you like?    Available: " + pearmax));
                        if (pearmax < pearquantity)
                        {

                            JOptionPane.showMessageDialog(null,("You have exceeded the limit"));

                        }

                        else
                        {
                        pearmax -= pearquantity;
                        totalp = pearquantity*pear;
                        DecimalFormat pearprice = new DecimalFormat("#.##");
                        JOptionPane.showMessageDialog(null, pearquantity + " Pear(s) were added to your cart" +", the total for pear(s) is $" + pearprice.format(totalp));
                        grandtotal += totalp;

               
                        int flag1=0;
                        String x1= pearquantity+" "+totalp;
                        if(pearquantity == pearquantity)
                        {
                             
                              File f1 = new File("orders.txt");
                        }
                        if(flag==0)
                            {
                                try{

                                         
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy/ HH:mm:ss");
                        Date today = Calendar.getInstance().getTime();        
                        String date= dateFormat .format(today);
                                    BufferedWriter out = new BufferedWriter(new FileWriter("orders.txt", true)); 
                                     
                     

                                    out.write("\n" +loginu + "  -- Pears:" + pearquantity+" Price $"+totalp + " Ordered on " + today);
                                    out.close();
                                }
                                catch (IOException o) {
                                    System.out.println("exception occoured" + o);
                                }
                            }
      
                              }
      
                        break;

                        case 5:
                        JOptionPane.showMessageDialog(null, "The Total Price is $" + grandtotal);
                        String[] gui4 = { "Exit", "Free Pick-Up", "Ship to your location"};
                        int selection4 = 3;
                        
                        while(selection4 !=0){
                        selection4 = JOptionPane.showOptionDialog(null, "How would you like to recieve these items?","Fruit Store",JOptionPane.PLAIN_MESSAGE,0,null,gui4,gui4[2]);
                        switch(selection4)

                        {
case 0:

System.exit(0);
break;

case 1:
JOptionPane.showMessageDialog(null, "Free Shipping");
JOptionPane.showMessageDialog(null, "Log in again to check your orders");

System.exit(0);

break;

case 2:
JOptionPane.showMessageDialog(null, "$3 Shipping fee");
grandtotal +=3;
JOptionPane.showMessageDialog(null, "Your new grand total is $" + grandtotal);
JOptionPane.showMessageDialog(null, "Log in again to check your orders");

System.exit(0);

break;
                        }
                    }



                        case 6:
                        JOptionPane.showMessageDialog(null, "Items In Stock| Banana:"+ banmax+"  Apple:"+ applemax+"  Orange:" + orangemax+"   Pear:"+pearmax);

                        break;


                        case 7:

                        try
                        {
                        BufferedReader in = new BufferedReader(new FileReader("Orders.txt"));
                        String line;
                        
    
                        while((line = in.readLine()) != null)
                        {
    
                            
                            if(line.startsWith(loginu))
                            JOptionPane.showMessageDialog(null, line);
    
                                     
    
                        }
                    
                        in.close();
                        
    
                    }
                        catch(IOException e)
                        {
                            e.printStackTrace();
                           
                        }
                    }



                        }
                        break;
                    
                }









                        if(data.equals(p))
                        {
                            JOptionPane.showMessageDialog(null, "account does not exist, please register");
                            System.exit(0);


                        }
                      }
                      
                    }
                
                      catch(IOException e)
                      {
                          e.printStackTrace();
                         
                      }
                




                break;



                case 1:



                int selection2 = 1;


                String createuser = JOptionPane.showInputDialog("Enter a Username:");
                String createpass = JOptionPane.showInputDialog( "Enter a Password:");
                JOptionPane.showMessageDialog(null, "Account Creation Successful, Please Log In");



                try {
             
                    File obj = new File("test.txt");
                     
                    if (obj.createNewFile()) 
                    {
                      System.out.println("File is created");
                    } 
                     
                  } 
                  catch (IOException e) 
                  {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                     
                  }


                  int flag=0;
                  String x1= createuser+" "+createpass;
                  if(createpass.equals(createpass))
                  {
                       
                        File f = new File("test.txt");
                  }
                  if(flag==0)
                      {
                          try{
                              BufferedWriter out = new BufferedWriter(new FileWriter("newtest.txt", true)); 
                              out.write("\n" + createuser+" "+createpass);
                              out.close();
                          }
                          catch (IOException o) {
                              System.out.println("exception occoured" + o);
                          }
                      }

            

                break;
                default:

                    break;
             }
        }        
    }
}

