// Project 5: Agents 2
// CSE1102 Spring 2015
// Shemona Singh
// March 18, 2015
// TA: Zigeng Wang
// Section: 005
// Instructor: Jeffrey A. Meunier

public class Agent {

	private Space _location;
	private String _name;

	//getters
	public Space getLocation(){
		return _location;
	}

	public String getName(){
		return _name;
	}

	//setters
	public void setLocation(Space s){
		_location = s;
	}

	public void setName(String n){
		_name = n;
	}

	public String toString(){
		return _name;
	}

	public String toStringLong(){
		String newString = _name + " is in " + _location;
		return newString;
	}

	public void usePortal(){
		if(_location != null){
			Portal portaltogoto = _location.getPortal();
			portaltogoto.transport(this);
			System.out.println(this._name + " is moving from " + _location + " to " + portaltogoto.getDestination());
		}
	}
	
}


