
class b02WazzupCls   {
	
	public static void main(String[] args) {  

		System.out.println("Hay, Wazzap!");

		for (int i=0; i<60; i++)
    		System.out.println();
	}
}  


	
/*                            ********************
                              *   Clear screen   * 
                              ********************

	Java doesn't seem to have a cls command, clearing the screen.

 	In writing moment as a rookie, I would guess that Java doesn't provide this capability 
 	as it is platform independent. But instead it would be possible to use a native command 
 	(by Runtime.exec). And depending OP (e.g. Windows, Linux/Mac) using cls or clear.  

	As Java can run without having a terminal associated to it's programs (platform indepen-
	dency), maybe this following page on C++ can be interesting. If one wish a program to run 
	from a terminal (like bash, prompt, xterm etc.).     

	http://www.cplusplus.com/articles/4z18T05o/#OSSpecificWays
 

	C#
	As c-charp runs on the .NET environment this is solved by: Console.Clear();

	Java
	Here, the WazzupCls.java emulates the behaviour of a cls. 

	i=0     means that "i" starts at 0
	i<60    ... and loops 60 times (less than 60, starts at 0)
	i++     ... every time increasing with 1. 

	println();
	        means to print something on an own line (new line). And as this line is empty 
	        there will be 60 empty lines before the prompt line shows up again.


	:) Later on, knowing more, I'll come back to cls. :)
*/ 