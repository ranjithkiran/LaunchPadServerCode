package com.google.launchpad.pkgmgmt.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import com.google.launchpad.pkgmgmt.dto.Language;
import com.google.launchpad.pkgmgmt.dto.ShareType;
import com.google.launchpad.pkgmgmt.dto.SharedType;

import javax.persistence.Id;

@Entity
@Table(name="T_SHARED_TYPE")
public class SharedTypeEntity {
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Enumerated(EnumType.STRING)
	private ShareType pkgShareType;
	
	@Column(name="SHARED_WITH_ID")
	private int sharedUserId;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public ShareType getPkgShareType() {
		return pkgShareType;
	}

	public void setPkgShareType(ShareType pkgShareType) {
		this.pkgShareType = pkgShareType;
	}

	public int getSharedUserId() {
		return sharedUserId;
	}

	public void setSharedUserId(int sharedUserId) {
		this.sharedUserId = sharedUserId;
	}
    
	public List<SharedType> getSharedTypeList(EntityManager em){
		List<SharedTypeEntity> sharedEntityList=new ArrayList();
		List<SharedType> sharedTypeList=new ArrayList();
		sharedEntityList=em.createQuery("SELECT * FROM T_SHARED_TYPE").getResultList();
		for(SharedTypeEntity sharedEntity:sharedEntityList){
			sharedTypeList.add(new SharedType(sharedEntity.getId(),sharedEntity.getPkgShareType(),sharedEntity.getSharedUserId()));
		}
		return sharedTypeList;
	}
	
}
