package com.tnsif.di;

public class Bike implements Vehicle {
 
	String name;
	String Model;
	
	public Bike()  {
		super();
	}
	
	public Bike(String name, String model) {
		super();
		this.name = name;
		Model = model;
		System.out.println(name +" " + model);	
	}
	

	@Override
	public void info() {
		// TODO Auto-generated method stub


}}