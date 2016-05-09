// Project 5: Agents 2
// CSE1102 Spring 2015
// Shemona Singh
// March 18, 2015
// TA: Zigeng Wang
// Section: 005
// Instructor: Jeffrey A. Meunier

public class Space {

	private String _name;
	private String _description;
	private Portal _portal;

	//getters
	public String getName() {
		return _name;
	}

	public String getDescription() {
		return _description;
	}

	public Portal getPortal() {
		return _portal;
	}

	//setters
	public void setName(String n){
		_name = n;		
	}

	public void setDescription(String d){
		_description = d;
	}

	public void setPortal(Portal p){
		_portal = p;
	}

	public String toString(){
		return _name;
	}

	public String toStringLong(){
		String string2 = _name + ": " + _description;
		if(_portal != null){
			return string2 + " with a ";
		}
		return _portal.toString();
			
	}




}
