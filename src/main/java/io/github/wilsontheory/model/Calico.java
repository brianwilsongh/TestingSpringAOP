package io.github.wilsontheory.model;

public class Calico {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		throw(new RuntimeException());
	}
	
	public String sendMeow(String input){
		return "Meowlico!";
	}
}
