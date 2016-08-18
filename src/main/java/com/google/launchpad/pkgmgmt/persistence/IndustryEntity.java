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

@Entity
@Table(name="T_INDUSTRY_TYPE")
public class IndustryEntity {
	

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

	public List<Industry> getIndustryTypesList(EntityManager em){
		List<IndustryEntity> industryEntityList=new ArrayList();
		List<Industry> industry=new ArrayList();
		industryEntityList=em.createQuery("SELECT * FROM T_INDUSTRY_TYPE").getResultList();
		for(IndustryEntity industryEntity:industryEntityList){
			industry.add(new Industry(industryEntity.getId(),industryEntity.getName()));
		}
		return industry;
	}

}
