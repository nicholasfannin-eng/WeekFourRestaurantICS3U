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
		System.out.println("To start off, would you want any refreshements? All non-alchoholic beverages are 2 dollars today.");
		String drink = in.nextLine();

        String message;
        // Assign the message variable 
        message = "A "+drink+" is a wonderful choice for 2 dollars.";
        
        // Print and run the code
        System.out.println(message);
	}

}
