package com.todo;

public class Todo {
	
	private String name;
	
	
	private String categorie;

	public Todo() {
		super();
	}

	public Todo(String name, String categorie) {
		super();
		this.name = name;
		this.categorie = categorie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Todo [name=" + name + ", categorie=" + categorie + "]";
	}
	
	
	
	

}
