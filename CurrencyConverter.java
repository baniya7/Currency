package converter;

import java. util.*;
//import java.lang.*;

public class CurrencyConverter {

    public static void main(String[] args) {
    	System.out.println("Welcome to online currency converter!!");
    	System.out.println("Please select one of the below mentioned currencies by pressing the number mentioned alongside it");
    	System.out.println("Ruppe : 1");
        System.out.println("Dollar : 2");
        System.out.println("Euro : 3");
        // take input
        Scanner sc = new Scanner(System.in); 
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
                Ruppe_to_other(amount);
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

public static void Ruppe_to_other(double amt) {
    System.out.println("1 Ruppe = " + 0.012 + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + String.format("%.2f",amt*0.012) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppe = " + 0.011 + " Euro");
    System.out.println();
    System.out.println(amt+" Ruppe = " + String.format("%.2f",amt*0.011) + " Euro");
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

