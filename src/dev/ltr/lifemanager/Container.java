package dev.ltr.lifemanager;

public class Container {
	
	private String NAME;
	private String ID;
	
	public Container() {
		
	}
	
	public Container(String name, String ID) {
		this.NAME = name;
		this.ID = ID;
	}
	
	public String getName() {
		return NAME;
	}
	
	public String getID() {
		return ID;
	}

}
