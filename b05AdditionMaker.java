import java.util.Scanner;

class b05AdditionMaker {

	public static void main(String[] args) {

		System.out.println("\n\n\n\t*  Welcome to the Additon Maker  *\n\n\t    Add three numbers and the \n\t     sum will be calculated!\n\n");

		Scanner write = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int sum;

		System.out.print("\t   Enter your first number: ");
		n1 = write.nextInt();

		System.out.print("\t   ...your second number: ");
		n2 = write.nextInt();

		System.out.print("\t   and last, your third number: ");
		n3 = write.nextInt();

		sum = n1 +n2 + n3;
		System.out.println("\n\n\tYour numbers are: " + n1 + " + " + n2 + " + " + n3 +" = " + sum + "\n\n");
	}
}