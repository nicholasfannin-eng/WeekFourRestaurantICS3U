import java.util.*;
/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date: Friday Sept. 25
 * Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the following criteria:
Create a restaurant of your choosing
Print menu items one at a time, including the price.
Ask how many of each item they would like to purchase
Must have at least 5 different menu items
Calculate the total price
If the total is more than $30, take off 10%.
If the total is more than $50, take off 20%.
Add 13% HST  to the total
Print out the initial price, any discounts, taxes, and the grand total.
Read in a payment amount from the user
Calculate the change
If the change is negative, state that they still owe you money.
This is to be done individually.
DO NOT use AI! 
Feel free to use previous notes, videos, and online resources like w3schools.com
Fork the repository, add me (MrZebarth) as a collaborator, clone the repository to your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Benji's, our new restaurant chain. Come try our various assortments of delicious, hot and steamy food.");
		System.out.println("To start off, what kind of drink do you want? All non-alchoholic beverages are 2 dollars today.");
		String drink = in.nextLine();

        String message;
        // Assign the message variable 
        message = "A "+drink+" is a wonderful choice for 2 dollars.";
        
        // Print and run the code
        System.out.println(message);
        System.out.println("How many "+drink+"s do you want?");
       int drinks = in.nextInt();
       System.out.println("So you want "+drinks+" "+drink+"s for "+drinks*2);
       System.out.println("Perfect and what would you like to eat today.");
       System.out.println("On the menu today, we have smash burgers, spagetti and meatballs, chili dogs, poutine and our special fried chicken.");
       String item1 = "Smash burger";
       double price1 = 19.99;
       String item2 = "Spagetti and meatballs";
       double price2 = 24.99;
       String item3 = "Chili Dog";
       double price3 = 15.99;
       String item4 = "Poutine";
       double price4 = 17.99;
       String item5 = "Fried Chicken";
       double price5 = 22.99;
       System.out.println("How many "+item1+"s do you want?");
       int sb = in.nextInt();
       System.out.println("Okay, "+sb+" smash burgers.");
       System.out.println("How many "+item2+"s do you want?");
       int sm = in.nextInt();
       System.out.println("And "+sm+" "+item2+"s.");
       System.out.println("What about our "+item3+"s?");
       int cd = in.nextInt();
       System.out.println("You chose "+cd+" "+item3+"s.");
       System.out.println("How many "+item4+"s would you like aswell?");
       int p = in.nextInt();
       System.out.println("So you want "+p+" "+item4+"s.");
       System.out.println("And our world-famous "+item5+"? Personally, I would recommend this one.");
       int fc = in.nextInt();
       System.out.println("Good choice, "+fc+" "+item5+"");
       double totalprice1 = price1*sb + price2*sm + price3*cd + price4*p + price5*fc + drinks*2;
       System.out.println("Here is the total price before savings: "+totalprice1+"");
       if (totalprice1>= 30) {
    	   totalprice1 *=0.90;
       if(totalprice1>= 50) {
    	   totalprice1 *=0.80;
       }
       }
       System.out.println("Here is the total price after savings: "+totalprice1+"");
       
       double tax = 1.13*totalprice1;
       System.out.println("What is the "+tax+"");
       double paidAmount = in.nextDouble();
       if (paidAmount >= totalprice1) {
    	   double change = totalprice1 + paidAmount;
       System.out.println("Thank you, we welcome you back anytime.");
       } else {
    	   double change = totalprice1 - paidAmount;
    	   System.out.println("Sorry, you do not have enough money. Don't make me call the police.");
       }
	}

}
