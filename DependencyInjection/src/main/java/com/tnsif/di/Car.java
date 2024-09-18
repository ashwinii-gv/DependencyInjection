package com.tnsif.di;

public class Car implements Vehicle {
	String name;
	String model;
	
	public Car() {  // when we comment this constructor and the constructor-arg tag in xml file we get an error as No default constructor found
		super();
	}

	public Car(String name, String model) {
		super();
		this.name = name;
		this.model = model;
		System.out.println("constructor is called");	
		System.out.println(name +" " + model);	
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
		System.out.println("setter inj");
		System.out.println(name +" "+ model);
	}


	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}
}


