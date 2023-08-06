package com.kh.practice.generics.model.vo;

public abstract class Fruit implements Comparable<Farm>{
	
	public Fruit() {
		
	}
	
	public Fruit(String kind, String name) {
		
	}

	@Override
	public String toString() {
		return "Fruit [toString()=" + super.toString() + "]";
	}
	
	public int hashCode() {
		return 0;
	}

	public boolean equals() {
		return false;
	}
}
