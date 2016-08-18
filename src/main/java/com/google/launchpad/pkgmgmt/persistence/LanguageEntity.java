package com.google.launchpad.pkgmgmt.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.launchpad.pkgmgmt.dto.Industry;
import com.google.launchpad.pkgmgmt.dto.Language;

@Entity
@Table(name="T_LANGUAGE_LIST")
public class LanguageEntity {
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Column(name="NAME")
	private String name;

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public List<Language> getIndustryTypesList(EntityManager em){
		List<LanguageEntity> langEntityList=new ArrayList();
		List<Language> lang=new ArrayList();
		langEntityList=em.createQuery("SELECT * FROM T_LANGUAGE_TYPE").getResultList();
		for(LanguageEntity langEntity:langEntityList){
			lang.add(new Language(langEntity.getId(),langEntity.getName()));
		}
		return lang;
	}

}
