# Basic Java Console Practices 🎄🎅

<br>

Hi!
This will be a repo with Java console practices that are the basics - first practices.<br>

It's fun to as soon as possible start "talking with" the prompt. So input/output will be the start. Then comes small practices and variations on the subject, followed by ...<br>

First out, a few output Java classes. Why not write a few small Java programs that the Java compiler (javac) will compile into bytecode (Java compiled source code). For the Java's virtual machine (JVM) to execute. A code saying: <i>Hay, Wazzap!</i> 🐋.<br><br>


> b01Wazzup.java &nbsp; &nbsp;b02WazzupCls.java &nbsp; &nbsp;b03WazzupRocket.java 

<br>

✅ &nbsp; <b>b01Wazzup.java</b>
``` javascript
class b01Wazzup {
	
	public static void main(String[] args) {  

		System.out.println("Hay, Wazzap!"); 	
	}
} 
``` 
<br>

✅ &nbsp; <b>b02WazzupCls.java</b>
``` javascript
class b02WazzupCls {
	
	public static void main(String[] args) {  

		System.out.println("Hay, Wazzap!");

		for (int i=0; i<60; i++)
		System.out.println();
	}
} 
```
<br>

✅ &nbsp; [<b>b03WazzupRocket.java</b>](https://github.com/evacaribbean/JavaConsole-basics/blob/master/b03WazzupRocket.java)
``` javascript
class b03WazzupRocket {
	
	public static void main(String[] args) { 
	 
		for (int i=0; i<30; i++)
		System.out.println();	
    	
 		System.out.println("                                                  1´");
 		System.out.println("                                              0´");
 		System.out.println("                                            ´\n\n"); 		  		 	
 		System.out.println("                                      *");
 		System.out.println("                                    *");
 		System.out.println("                                 * *");
 		System.out.println("                              *     *");
 		System.out.println("                            *        *");
 		System.out.println("                           *         *");
 		System.out.println("                          *         *");
 		System.out.println("                         *         *              Hay, Wazzaaaap! :)       ´");
 		System.out.println("                        *         *                                     ´");
 		System.out.println("                      *          *                                     ~~");
 		System.out.println("                    *     *      *                                    /  \\");
 		System.out.println("                 *      *    *    *                                  |oo  <");
 		System.out.println("               *     *         *   *                                  \\= /");
 		

 		>> continues		 		 
``` 
<br>

Additional notes and comments will be in each `Java file`.

<br><br><br><br>




## Input/Output

<br>

> b04FortuneNumTelling.java &nbsp; &nbsp;b05AdditionMaker.java &nbsp; &nbsp;b06ClockTable.java

<br>

✅ &nbsp; [<b>b04FortuneNumTelling.java</b>](https://github.com/evacaribbean/JavaConsole-basics/blob/master/b04FortuneNumTelling.java)
<br>
``` javascript
import java.util.Scanner;

class b04FortuneNumTelling {

	public static void main(String[] args) {

		Scanner userMessage = new Scanner(System.in);
	 	int n1; 
	 	String s1 = "* A thrilling time is in your immediate future *";
	 	String s2 = "* Your fondest dream will come true within this year *";
	 	String s3 = "* You have a deep interest in all that is artistic *";
	 	String s4 = "* Good health will be yours for a long time *";
	 	String s5 = "* A single conversation with a wise man is better than ten years of study *";
	 	String s6 = "* Never upset the driver of the car you're in; they're the master of your destiny until you get home *";
	 	String s7 = "* You only need look to your own reflection for inspiration. Because you are Beautiful! *";
	 	String s8 = "* The time is alway right to do what is right *";
	 	String s9 = "* Rivers need springs *";


	 	>> continues
```
<br>

✅ &nbsp; [<b>b05AdditionMaker.java</b>](https://github.com/evacaribbean/JavaConsole-basics/blob/master/b05AdditionMaker.java)
<br>
``` javascript
import java.util.Scanner;

class b05AdditionMaker {

	public static void main(String[] args) {

		System.out.println("\n\n\n\t*  Welcome to the Additon Maker  *\n\n\t    Add three numbers and the \n\t     sum will be calculated!\n\n");

		Scanner write = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int sum;


		>> continues
```
<br>

✅ &nbsp; [<b>b06ClockTable.java</b>](https://github.com/evacaribbean/JavaConsole-basics/blob/master/b06ClockTable.java)
<br>
``` javascript
import java.util.Scanner;

class b06ClockTable {
	
	public static void main(String[] args) {  

		for (int i=0; i<30; i++)
		System.out.println();
		System.out.println("                                     _");
		System.out.println("                                   11  1");
		System.out.println("                                 10  |   2");
		System.out.println("                                -    *__  -");
		System.out.println("                                 8       4");
		System.out.println("                                   7 _ 5");

		for (int i=0; i<6; i++)
		System.out.println();

		Scanner scan = new Scanner(System.in);
		int num;


		>> continues   
```
 
<br><br><br><br>




## Variables and concatenation 

<br>

> b07TeamCatAnDog.java &nbsp; &nbsp;b08LibraryLauncher.java &nbsp; &nbsp;b09[something].java

<br>

☑ &nbsp; [<b>b07TeamCatAnDog.java</b>](https://github.com/evacaribbean/JavaConsole-basics/blob/master/b07TeamCatAnDog.java)
<br>
``` 
import java.util.Scanner;

class b07TeamCatAnDog	{

	public static void main(String[] args) {

		// The variables
		int catNum, dogNum, sum;
		String catName, dogName, userName, city;

		Scanner userWrite = new Scanner(System.in);

		// The statements
		System.out.println("\n\n\n\t\tWelcome to the Cat & Dog Teams!");
		System.out.println("\n\tPlease introduce your team by entering your forename,");


		>> continues 
```
<br>

☑ &nbsp; <b>b08LibraryLauncher.java</b><br>
``` 
On it's way... 🐳🐬. .🐠..
```
<br>

☑ &nbsp; <b>b09[something].java</b><br>
``` 
...
```
 
<br><br><br><br>




## Statments, loops and branching 
<br>
More to come... &nbsp; ⛷<br><br>

<br><br><br><br>