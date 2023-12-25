package converter;

import java. util.*;
//import java.lang.*;

public class CurrencyConverter {
	public static void main(String[] args) 
	{
		converter(0.012, 0.011, 1.10, 0.91, 83.33,90.90 );
	}
	public  static void converter(double RtoD, double RtoE, double EtoD, double DtoE, double DtoR, double EtoR ) {

    	System.out.println("Welcome to online currency converter!!");
    	System.out.println("Hi please specify you role by selecting the number alongside given options");
    	System.out.println("To login as an user press: 1");
    	System.out.println("To login as a admin press: 2");
    	Scanner myObj = new Scanner(System.in);
    	while(!myObj.hasNextInt())
		{
			System.out.println("Wrong input!!");
			System.out.println("Please enter a numeric value");
			myObj.next();
		}
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
             }
        } 
         if (pass.equals(passWord) &&  usrName.equals(userName)) 
         {
            System.out.println("Welcome");
            // take input  
            System.out.println("To view currency rates press: 1");
            System.out.println("To convert currency in desired currency: 2");
            System.out.println("Choose your selection");
            Scanner obj = new Scanner(System.in);
            while(!obj.hasNextInt())
    		{
    			System.out.println("Wrong amount!!");
    			System.out.println("Please enter a numeric amount value");
    			obj.next();
    		}
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
             System.out.println("1 US dollar to Indian Ruppee = "+String.format("%.2f", DtoR)+ "INR");
           	 System.out.println("1 INR to US Dollar = "+String.format("%.2f", RtoD)+ "US Dollar");
           	 System.out.println("1 EURO to Indian Ruppee = "+String.format("%.2f", EtoR)+"INR");
           	 System.out.println("1 INR to Euro = "+String.format("%.2f", RtoE)+"EURO");
           	 System.out.println("1 Dollar to Euro = "+String.format("%.2f", DtoE)+"EURO ");
           	 System.out.println("1 Euro to US Dollar = "+String.format("%.2f", EtoD)+"US Dollar ");
            }
            
            if(selection == 2) {
            Scanner sc = new Scanner(System.in); 
            System. out.println("Choose your currency you want to convert");
            System.out.println("If you want to convert Ruppe press: 1");
            System.out.println("If you want to convert Dollar press: 2");
            System.out.println("If you want to convert Euro press: 3");
            while(!sc.hasNextInt())
    		{
    			System.out.println("Wrong amount!!");
    			System.out.println("Please enter a numeric amount value");
    			sc.next();
    		}
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
            	//sc.close();
            	// convert the amount
            switch (choice) {
                case 1:
                    Ruppe_to_other(amount, RtoD, RtoE);
                    break;
                case 2:
                    Dollar_to_other(amount, DtoR, DtoE);
                    break;
                case 3:
                    Euro_to_other(amount, EtoR, EtoD);
                    break;
            }
         }
           System.out.println("If you want to start a new session press 0 or and other key to exit");
           String back=obj.next();
           if(back.equals("0"))
        	   User(RtoD,  RtoE,  EtoD,  DtoE,  DtoR,  EtoR);
           else
        	   System.out.println("Exiting the session");
         }
              
         }

public static void Admin(double RtoD, double RtoE, double EtoD, double DtoE, double DtoR, double EtoR)
{	
	int attempts_admin = 3;
    String usrName_admin = "ADMIN";
	String pass_admin = "Admin123";
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
        while(!obj.hasNextInt())
		{
			System.out.println("Wrong amount!!");
			System.out.println("Please enter a numeric amount value");
			obj.next();
		}
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
        	 System.out.println("1 US dollar to Indian Ruppee = "+String.format("%.2f", DtoR)+ "INR");
        	 System.out.println("1 INR to US Dollar = "+String.format("%.2f", RtoD)+ "US Dollar");
        	 System.out.println("1 EURO to Indian Ruppee = "+String.format("%.2f", EtoR)+"INR");
        	 System.out.println("1 INR to Euro = "+String.format("%.2f", RtoE)+"EURO");
        	 System.out.println("1 Dollar to Euro = "+String.format("%.2f", DtoE)+"EURO ");
        	 System.out.println("1 Euro to US Dollar = "+String.format("%.2f", EtoD)+"US Dollar ");
        }
        
        if(selection == 2) 
        {
        	System.out.println("Please tell the currency conversion you want to change:");
        	System.out.println("For 1 Indian Ruppee to 1 US Dollar : 1");
        	System.out.println("For 1 Indian Ruppee to 1 Euro : 2");
        	System.out.println("For 1 Euro to 1 US Dollar : 3");
        	Scanner conv=new Scanner(System.in);
        	while(!conv.hasNextInt())
    		{
    			System.out.println("Wrong amount!!");
    			System.out.println("Please enter a numeric amount value");
    			conv.next();
    		}
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
         		System.out.println("1 INR="+String.format("%.2f", RtoD)+"USD");
         		System.out.println("1 USD="+String.format("%.2f", DtoR)+"INR");		
         	}	
        	if(convchoice==2)
        	{
        		System.out.println("Please enter the new value:");
        		RtoE=conv.nextDouble();
        		EtoR=1/RtoE;
        		System.out.println("New values:");
        		System.out.println("1 INR="+String.format("%.2f", RtoE)+"Euro");
        		System.out.println("1 Euro="+String.format("%.2f", EtoR)+"INR");
        	}
        	if(convchoice==3)
        	{
        		System.out.println("Please enter the new value:");
        		EtoD=conv.nextDouble();
        		DtoE=1/EtoD;
        		System.out.println("New values:");
        		System.out.println("1 Euro="+String.format("%.2f", EtoD)+"USD");
        		System.out.println("1 USD="+String.format("%.2f", DtoE)+"Euro");	
        	}	
        }
        System.out.println("Press 0 to return to login as user, 1 for admin or any other key to exit the session");
        String back=obj.next();
        if(back.equals("0"))
        {
        System.out.println("Welcome please enter your user's credentials to login as user");
       	 User(RtoD,  RtoE,  EtoD,  DtoE,  DtoR,  EtoR);
        }
        else if(back.equals("1"))
        {
        	System.out.println("Welcome please enter your admin's credentials to login as admin");
        	Admin( RtoD,  RtoE,  EtoD,  DtoE,  DtoR,  EtoR);
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
    

public static void Dollar_to_other(double amt, double DtoR, double DtoE) {
    System.out.println("1 Dollar = " + DtoR + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + String.format("%.2f",amt*DtoR) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar= " + DtoE + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + String.format("%.2f",amt*DtoE) + " Euro");
}

    

public static void Euro_to_other(double amt, double EtoR, double EtoD){
    System.out.println("1 Euro = " + EtoR + " Ruppe");
    System.out.println();
    System.out.println(amt+" Euro = " + String.format("%.2f",amt*EtoR) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro = " + EtoD + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + String.format("%.2f",amt*EtoD) + " Dollar");
}
}