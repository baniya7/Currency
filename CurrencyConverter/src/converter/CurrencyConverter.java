package converter;

import java. util.*;
//import java.lang.*;

public class CurrencyConverter {

    public static void main(String[] args) {
    	int run=0;
    	if(run==0)
    	{
    		double RtoD=0.012;
    		double DtoR=83.18;
    		double DtoE=0.92;
    		double EtoD=1.09;
    		double RtoE=0.011;
    		double EtoR=90.90;
    	}
    	System.out.println("Welcome to online currency converter!!");
    	System.out.println("Hi please specify you role by selecting the number alongside given options");
    	System.out.println("To login as an user press: 1");
    	System.out.println("To login as a admin press: 2");
    	Scanner myObj = new Scanner(System.in);
    	int role=myObj.nextInt();
    	if (role != 1 && role!=2)
    	{
    		while(true)
    		{
    			System.out.println("Wrong Input!!");
    			System. out.println("Please choose one of the above mentioned roles");
    			role = myObj.nextInt();
    			if (role == 1 || role==2)
    				{
    					run++;
    					break;
    				}
    			else 
    				continue;
    		}
    	}  
    	switch(role) {
    	case 1 :
    		User( RtoD,  RtoE,  EtoD,  DtoE,  DtoR,  EtoR);
    		break;
    	case 2:
    		Admin( RtoD,  RtoE,  EtoD,  DtoE,  DtoR,  EtoR);
    		break;
    	}
        
//System.out.println(DtoR);
                }
             
             
 
public static void User(double RtoD, double RtoE, double EtoD, double DtoE, double DtoR, double EtoR)
{
	int attempts = 3;
    String usrName = "USERNAME";
	String pass = "User123";  		
 	  // Create a Scanner object
    	Scanner myObj=new Scanner(System.in);
   	System.out.println("Enter username");
         String userName = myObj.nextLine();
   	 System.out.println("Enter password");
         String passWord = myObj.nextLine();
    	
         if(!pass.equals(passWord) || !usrName.equals(userName))
         {
        	 while(attempts>0 && (!pass.equals(passWord) ||  !usrName.equals(userName)))
        	 {
        		 System.out.println("Incorrect. Number of attempts remaining: " + --attempts);  
        		 if(attempts>0)
        			 {
        			 System.out.println("Enter username");
        			 userName = myObj.nextLine();
            		 System.out.println("Enter password");
            		 passWord = myObj.nextLine();
        			 }
        		 
        	 }
        	 if(attempts==0)
        	 {
        		 System.out.println("No retry remaining");
        		 System.exit(attempts);
        }}
         
         if (pass.equals(passWord) &&  usrName.equals(userName)) {
        	
            System.out.println("Welcome");
            // take input
            
            System.out.println("1. To view currency rates");
            System.out.println("2. To convert currency in desired currency");
            System.out.println("Choose your selection");
            
            Scanner obj = new Scanner(System.in);
            
            int selection = obj.nextInt();
            if(selection !=1 && selection !=2)
            {
            	while(true)
        		{
        			System.out.println("Wrong Input!!");
        			System. out.println("Please choose one of the above mentioned option");
        			selection = obj.nextInt();
        			if (selection == 1 || selection==2)
        				break;
        			else 
        				continue;
        		}
            }
            
            if(selection == 1)
            {
            	 System.out.println("1 US dollar to Indian Ruppee = 83.18 INR");
            	 System.out.println("1 INR to US Dollar = 0.012 US Dollar");
            	 System.out.println("1 EURO to Indian Ruppee = 90.90 INR");
            	 System.out.println("1 INR to Euro = 0.011 EURO");
            	 System.out.println("1 Dollar to Euro = 0.92 EURO ");
            	 System.out.println("1 Euro to US Dollar = 1.09 US Dollar ");
            }
            
            if(selection == 2) {
            Scanner sc = new Scanner(System.in); 
            System.out.println("1 Ruppe");
            System.out.println("2 Dollar");
            System.out.println("3 Euro");
            System. out.println("Choose the currency");
        	int choice = sc.nextInt();
        	if (choice != 1 && choice!=2 && choice!= 3)
        	{
        		while(true)
        		{
        			System.out.println("Wrong Input!!");
        			System. out.println("Please choose one of the above mentioned currency");
        			choice = sc.nextInt();
        			if (choice == 1 || choice==2||choice== 3)
        				break;
        			else 
        				continue;
        		}
        	}    
            	System.out.println("Enter the amount");
            		while(!sc.hasNextDouble())
            		{
            			System.out.println("Wrong amount!!");
            			System.out.println("Please enter a numeric amount value");
            			sc.next();
            		}
            	double amount = sc.nextDouble();
            	sc.close();
            	// convert the amount
            switch (choice) {
                case 1:
                    Ruppe_to_other(amount, RtoD, RtoE);
                    break;
                case 2:
                    Dollar_to_other(amount);
                    break;
                case 3:
                    Euro_to_other(amount);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
	
}
            System.out.println("Press 0 to return to main login");
             String back=obj.next();
             if(back=="0")
             {
            	 main(null);
             }
             else
            	 System.out.println("Exiting the session");
         }      }

public static void Admin(double RtoD, double RtoE, double EtoD, double DtoE, double DtoR, double EtoR)
{
	
	int attempts_admin = 3;
    String usrName_admin = "USERNAME";
	String pass_admin = "User123";
 // Create a Scanner object
	Scanner myObj=new Scanner(System.in);
	System.out.println("Enter username");
    String userName_admin = myObj.nextLine();
	 System.out.println("Enter password");
     String passWord_admin = myObj.nextLine();
	
     if(!pass_admin.equals(passWord_admin) || !usrName_admin.equals(userName_admin))
     {
    	 while(attempts_admin>0 && (!pass_admin.equals(passWord_admin) ||  !usrName_admin.equals(userName_admin)))
    	 {
    		 System.out.println("Incorrect. Number of attempts remaining: " + --attempts_admin);  
    		 if(attempts_admin>0)
    			 {
    			 System.out.println("Enter username");
    			 userName_admin = myObj.nextLine();
        		 System.out.println("Enter password");
        		 passWord_admin = myObj.nextLine();
    			 }
    		 
    	 }
    	 if(attempts_admin==0)
    	 {
    		 System.out.println("No retry remaining");
    		 System.exit(attempts_admin);
    }
     }
     if (pass_admin.equals(passWord_admin) &&  usrName_admin.equals(userName_admin)) {
    	
        System.out.println("Welcome");
        System.out.println("1. To view currency rates");
        System.out.println("2. To change the rate of currency");
        System.out.println("Choose your selection");
        
        Scanner obj = new Scanner(System.in);
        
        int selection = obj.nextInt();
        if(selection !=1 && selection !=2)
        {
        	while(true)
    		{
    			System.out.println("Wrong Input!!");
    			System. out.println("Please choose one of the above mentioned options");
    			selection = obj.nextInt();
    			if (selection == 1 || selection==2)
    				break;
    			else 
    				continue;
    		}
        }
        if(selection == 1)
        {
        	 System.out.println("1 US dollar to Indian Ruppee = 83.18 INR");
        	 System.out.println("1 INR to US Dollar = 0.012 US Dollar");
        	 System.out.println("1 EURO to Indian Ruppee = 90.90 INR");
        	 System.out.println("1 INR to Euro = 0.011 EURO");
        	 System.out.println("1 Dollar to Euro = 0.92 EURO ");
        	 System.out.println("1 Euro to US Dollar = 1.09 US Dollar ");
        }
        
        if(selection == 2) 
        {
        	System.out.println("Please tell the currency conversion you want to change:");
        	System.out.println("For 1 Indian Ruppee to 1 US Dollar : 1");
        	System.out.println("For 1 Indian Ruppee to 1 Euro : 2");
        	System.out.println("For 1 Euro to 1 US Dollar : 3");
        	Scanner conv=new Scanner(System.in);
        	int convchoice=conv.nextInt();
        	 if(convchoice !=1 && convchoice !=2 && convchoice !=3)
             {
             	while(true)
         		{
         			System.out.println("Wrong Input!!");
         			System. out.println("Please choose one of the above mentioned option");
         			convchoice = conv.nextInt();
         			if (convchoice == 1 || convchoice==2 || convchoice==3)
         				break;
         			else 
         				continue;
         		}
             }
        	 if(convchoice==1)
         	{
         		System.out.println("Please enter the new value:");
         		RtoD=conv.nextDouble();
         		DtoR=1/RtoD;
         		System.out.println("New values:");
         		System.out.println("1 INR="+RtoD+"USD");
         		System.out.println("1 USD="+DtoR+"INR");
         	}	
        	if(convchoice==2)
        	{
        		System.out.println("Please enter the new value:");
        		RtoE=conv.nextDouble();
        		EtoR=1/RtoE;
        		System.out.println("New values:");
        		System.out.println("1 INR="+RtoE+"Euro");
        		System.out.println("1 Euro="+EtoR+"INR");
        	}
        	if(convchoice==3)
        	{
        		System.out.println("Please enter the new value:");
        		EtoD=conv.nextDouble();
        		DtoE=1/EtoD;
        		System.out.println("New values:");
        		System.out.println("1 Euro="+EtoD+"USD");
        		System.out.println("1 USD="+DtoE+"Euro");
        	}	
        }
        System.out.println("Press 0 to return to main login");
        String back=obj.next();
        if(back=="0")
        {
       	 main(null);
        }
        else
       	 System.out.println("Exiting the session");
     }
}

public static void Ruppe_to_other(double amt, double RtoD, double RtoE ) {
    System.out.println("1 Ruppe = " + RtoD + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + String.format("%.2f",amt*RtoD) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppe = " + RtoE + " Euro");
    System.out.println();
    System.out.println(amt+" Ruppe = " + String.format("%.2f",amt*RtoE) + " Euro");
    System.out.println();

}
    

public static void Dollar_to_other(double amt) {
    System.out.println("1 Dollar = " + 83.22 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + String.format("%.2f",amt*83.22) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar= " + 0.91 + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + String.format("%.2f",amt*0.91) + " Euro");
}

    

public static void Euro_to_other(double amt){
    System.out.println("1 Euro = " + 90.90 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Euro = " + String.format("%.2f",amt*90.90) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro = " + 1.09 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + String.format("%.2f",amt*1.09) + " Dollar");
}

}