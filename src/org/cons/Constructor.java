package org.cons;

public class Constructor {

	//1
    public Constructor() {
	
	    this(777);
	    System.out.println("Default constructor");
	
    }
  
    //2
	public Constructor(String name) {
		
		System.out.println("Name is :" +name);
	}
	//3
	public Constructor( int id) {
		this("MMM");
		System.out.println("ID no is :" + id);
	}
	
	//Main method
	public static void main(String[] args) {
		Constructor c = new Constructor();
		
	}
  }
	
