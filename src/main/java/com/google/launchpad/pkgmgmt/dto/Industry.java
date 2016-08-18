package com.google.launchpad.pkgmgmt.dto;

/**
 * Data Transfer Object to hold Industry data
 * @author kirangk
 *
 */
public class Industry {
	
	private int Id;
	private String name;
	
	public Industry(int Id,String name){
		this.Id=Id;
		this.name=name;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Industry [Id=" + Id + ", name=" + name + "]";
	}
	
}
