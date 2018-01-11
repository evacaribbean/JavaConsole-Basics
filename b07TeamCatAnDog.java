import java.util.Scanner;

class b07TeamCatAnDog	{

	public static void main(String[] args) {

		// The variables
		int catNum, dogNum, sum;
		String catName, dogName, userName, city;

		Scanner userWrite = new Scanner(System.in);

		// The statementes
		System.out.println("\n\n\n\t\tWelcome to the Cat & Dog Teams!");
		System.out.println("\n\tPlease introduce your team by entering your forename,");
		System.out.println("\tyour team members' names. How many members you are");
		System.out.println("\tand in which city you live.");

		System.out.print("\n\n\tEnter you forename: ");
 		userName = userWrite.nextLine();
		System.out.println("\n\tHi " + userName + "!");

		System.out.print("\n\tEnter your dog members' names in the team: ");
		dogName = userWrite.nextLine();

		System.out.print("\n\t...and you cat members' names: ");
		catName = userWrite.nextLine();

		System.out.print("\n\tEnter how many cats \"The Cat & Dogs Team " + userName + "\" have: ");
		catNum = userWrite.nextInt();

		System.out.print("\n\t...and how many dogs ( " + dogName + " ) the team have: ");
		dogNum = userWrite.nextInt();

		System.out.print("\n\n\tAnd last, in which city does your team \"The Cat & Dogs Team " + userName + "\" live?  ");
		city = userWrite.next();

		// The presentation
		System.out.println("\n\n\n\n\t*************  The Cat & Dogs Team " + userName + "  *************\n\n");

		System.out.println("\t*  The cat member's names:  " + catName);
		System.out.println("\t*  The dog member's names:  " + dogName);

		sum = dogNum + catNum + 1;
		System.out.println("\n\t*  The number of members in \"The Cat & Dogs Team " + userName + "\" :  " + sum + " members");

		System.out.println("\n\t*  Where " + dogNum + " of the members in the team are dogs and " + catNum + " are cats.");	 
		System.out.println("\n\n");
		System.out.println("\t*********************************************************");
		System.out.println("\n\n\n");
	}
}


/*

With two different primitive variables (int and string) I had to "trix" a bit, as I don´t know right now 
how to fully code in conjunction with system.in scanner. This sequence works swell.

You can try to mix and switch places between int and string. When I did so in some orders, the program 
"doublejumped". So the user can't fill in the following question. 

But I'll come back to this later on! :):) 

*/