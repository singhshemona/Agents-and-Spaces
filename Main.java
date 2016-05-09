// Project 5: Agents 2
// CSE1102 Spring 2015
// Shemona Singh
// March 18, 2015
// TA: Zigeng Wang
// Section: 005
// Instructor: Jeffrey A. Meunier

public class Main {
	
public static void main(String[] args) {
	
	Space bed = new Space();
	bed.setName("My Room");
	bed.setDescription("Roomy but slightly messy");
	
	Space bath = new Space();
	bath.setName("My Bathroom");
	bath.setDescription("Double sink and way too big for one person");
	
	Space bed2 = new Space();
	bed2.setName("Friend's Room");
	bed2.setDescription("Clothes everywhere, shoes sprawled, classically messy");
	
	Space eat = new Space();
	eat.setName("Kitchen");
	eat.setDescription("Best place in the house");
	
	Portal p1 = new Portal();
	p1.setName("Door 1");
	p1.setDirection("leave");
	p1.setDestination(bath);
	
	Portal p2 = new Portal();
	p2.setName("Door 2");
	p2.setDirection("leave");
	p2.setDestination(bed2);
	
	Portal p3 = new Portal();
	p3.setName("Door 3");
	p3.setDirection("outside");
	p3.setDestination(eat);
	
	bed.setPortal(p1);
	bed.setPortal(p2);
	bed2.setPortal(p3);
	
	Agent Shemona = new Agent();
	Shemona.setName("Shemona");
	Shemona.setLocation(bed);
	CommandInterpreter.run(Shemona);
	
}

}
