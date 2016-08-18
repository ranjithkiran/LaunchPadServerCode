package com.google.launchpad.pkgmgmt.dto;

/**
 * Data Transfer Object to hold Language Data
 * @author kirangk
 *
 */
public class Language {
	
	private int Id;
	private String name;
	
	public Language(int Id,String name){
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
		return "Language [Id=" + Id + ", name=" + name + "]";
	}
	
	
} 
