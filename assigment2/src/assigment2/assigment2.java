package assigment2;

import java.util.Scanner;

public class assigment2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	      char order = 'Y';
	      int mackup;
	      int id;
	      int fhone;
	      int buy = 0;
	      double price = 0;
	      double amount;
	      double totalprice;
	      double balance;
	      double lipstick, blusher, foundation,eyeliner, maskara;
	      double total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 =0;

	   
	      System.out.print("Enter your name: ");
	      String myName = scan.nextLine();
	      System.out.print("Enter your ID: ");
	      id = scan.nextInt();

	      System.out.print("Enter your number fhone: ");
	      fhone = scan.nextInt();
	      
	    
	      do {
	      System.out.println("\nWELCOME TO Izans beauty");
	      System.out.print("1\tLipstick\t");
	      System.out.print("RM");
	      lipstick = scan.nextDouble();
	      

	      System.out.print("2\tBlusher\t\t");
	      System.out.print("RM");
	      blusher = scan.nextDouble();
	      
	     

	      System.out.print("3\tFoundation\t\t\t");
	      System.out.print("RM");
	      foundation = scan.nextDouble();
	      
	      
	      System.out.print("4\tEyeliner\t\t\t");
	      System.out.print("RM");
	      eyeliner = scan.nextDouble();
	      
	      
	      System.out.print("5\tMaskara\t\t\t");
	      System.out.print("RM");
	      maskara = scan.nextDouble();
	      

	      System.out.print("\nWhich mackup? ");
	      mackup = scan.nextInt();

	      System.out.print("How many you want? ");
	      buy = scan.nextInt();

	    


	      

	      {
	      if (mackup == 1)
	      System.out.print("\nCurrent total price: RM" + total1); 
	     
	      else if (mackup == 2)
	      System.out.print("\nCurrent total price: RM" + total2);
	      else if (mackup == 3)
	      System.out.print("\nCurrent total price: RM" + total3);
	      else if (mackup == 4)
		      System.out.print("\nCurrent total price: RM" + total4);
	      else if (mackup == 5)
		      System.out.print("\nCurrent total price: RM" + total5);
	      
	      else
	      System.out.print("\nInvalid mackup option");


	      

	      switch(mackup) {
	      case 1: price = lipstick * buy;
	      break;
	      case 2: total2 = blusher * buy;
	      break;
	      case 3: total3 = foundation * buy;
	      break;
	      case 4: total4 = eyeliner * buy;
	      break;
	      case 5: total5 = maskara * buy;
	      break;
	      default: System.out.println("The number is invalid");
	      }
	      }

	      System.out.print("\nDo you want to add your order? (Y/N): ");
	      order = scan.next().charAt(0);
	      
	     
	      } while(order == 'Y'); 

	      System.out.println("\nBILL");
	      System.out.println("--------------");
	      

	      totalprice = total1 + total2 + total3 + total4 +total5;
	      System.out.print("Total price for your order: RM" + totalprice);

	      

	      System.out.print("\nEnter a amount: RM");
	      amount = scan.nextDouble();

	      

	      balance = amount - totalprice;

	      

	      System.out.print("\nBalance: RM" + balance);
	      
	     
	      System.out.println("\nThank you. Please come again");
	      
	     
		
		
		
		
		
	}

}
