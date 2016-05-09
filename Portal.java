// Project 5: Agents 2
// CSE1102 Spring 2015
// Shemona Singh
// March 18, 2015
// TA: Zigeng Wang
// Section: 005
// Instructor: Jeffrey A. Meunier

public class Portal {

	private String _name;
	private String _direction;
	private Space _destination;

	//getters
	public String getName(){
		return _name;
	}
	
	public String getDirection(){
		return _direction;
	}
	
	public Space getDestination(){
		return _destination;
	}

	//setters
	public void setName(String n){
		_name = n;
	}
	
	public void setDirection(String d){
		_direction = d;
	}
	
	public void setDestination(Space des){
		_destination = des;
	}
	
	public String toString(){
		return _name + " that goes " + _direction;
	}
	
	public String toStringLong(){
		return toString() + " to " + _destination;
	}
	
	public void transport(Agent x){
		x.setLocation(_destination);
	}
}