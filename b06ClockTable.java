import java.util.Scanner;

class b06ClockTable	{
	
	public static void main(String[] args) {  

		for (int i=0; i<30; i++)
    	System.out.println();
		 
		System.out.println("                                     _");
		System.out.println("                                   11  1");
		System.out.println("                                 10  |   2");
		System.out.println("                                -    *__  -");
		System.out.println("                                 8       4");
		System.out.println("                                   7 _ 5");
		System.out.println("");

		for (int i=0; i<5; i++)
    	System.out.println();

		Scanner scan = new Scanner(System.in);		
		int num;		 

    	System.out.println("\tPress a number an'enter to see a list of different watch brands\n\n");
    	num = scan.nextInt();
    	System.out.println("\n");	
     
		System.out.println("\t\tQuartz\tCasio\tEyki\tGul\tCertina\n");
		System.out.println("\t\tSkagen\tSwatch\tEdox\tTriwa\tTissot\n");
		System.out.println("\t\tMorris\tGant\tSwiss\tFossil\tMockberg\n");
 	 	System.out.println("\t\tDisel\tCarl Edmond\tGiorgio Fedon\n\n\n\n");
	}
}   