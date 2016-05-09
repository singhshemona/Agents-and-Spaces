// Project 5: Agents 2
// CSE1102 Spring 2015
// Shemona Singh
// March 18, 2015
// TA: Zigeng Wang
// Section: 005
// Instructor: Jeffrey A. Meunier

import java.util.Scanner;

public class CommandInterpreter {

	public static void run(Agent a){
		Scanner kbd = new Scanner(System.in);
		boolean var = true;
		
		System.out.println(a.getName() + " is in " + a.getLocation());

		do{
			System.out.println("==> ");
			String newString = kbd.next();	
			if(newString.equals("quit")){
				var = false;				
			}
			else if(newString.equals("go")){
				a.usePortal();							
			}
			else if(newString.equals("help")){
				System.out.println("You may use the following commands: go, help, look, where");
			}
			else if(newString.equals("look")){
				System.out.println(a.getLocation().toString());
			}
			else if(newString.equals("where")){
				System.out.println(a.getLocation().toStringLong());
			}
			else{
				System.out.println("Whoops, this is an error!");
			}	

		}

		while (var == true);
	}

}