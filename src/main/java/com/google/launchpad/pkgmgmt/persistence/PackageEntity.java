package com.google.launchpad.pkgmgmt.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.launchpad.pkgmgmt.dto.Asset;
import com.google.launchpad.pkgmgmt.dto.Package;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Entity class for T_PACKAGE table
 *
 */
@Entity
@Table(name="T_PACKAGE")
public class PackageEntity {
	
	public PackageEntity(){
		
	}
	
	public PackageEntity(Package pkg){
		this.id = pkg.getId();
		this.name=pkg.getName();
		this.assetList=new ArrayList<AssetEntity>();
		this.createDate=pkg.getCreateDate();
		this.delieveryType=pkg.getDelieveryType();
		this.industryId=pkg.getIndustryId();
		this.instructions=pkg.getInstructions();
		this.language=pkg.getLanguage();
		this.parentPackageId=pkg.getParentPackageId();
		this.lastUpdateDate=pkg.getLastUpdateDate();
		this.noOfUsers=pkg.getNoOfUsers();
		this.userId=pkg.getUserId();
	//TODO: for other fields
	}
	
	@Id
	@GeneratedValue
	@Column(name="PACKAGE_ID")
	private int id;//primary key
   
	@Column(name="NAME")
	private String name;
   
	@OneToMany(mappedBy = "pkgEntity")
	private List<AssetEntity> assetList;
   
	@Column(name="PARENT_PACKAGE_ID")
	private int parentPackageId;
   
	@Column(name="INSTRUCTIONS")
	private String instructions;
   
	@Column(name="CREATE_DATE")
	private Date createDate;
   
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;
   
	@Column(name="NO_OF_USERS")
	private int noOfUsers;
   
	@Column(name="USER_ID")
	private int userId;
   
	@Column(name="INDUSTRY_ID")
	private int industryId;
   
	@Column(name="DELIEVERY_TYPE")
	private String delieveryType;
   
	@Column(name="LANGUAGE")
	private String language;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	
	public List<AssetEntity> getAssetList() {
		return assetList;
	}

	public void setAssetList(List<AssetEntity> assetList) {
		this.assetList = assetList;
	}

	public int getParentPackageId() {
		return parentPackageId;
	}

	public void setParentPackageId(int parentPackageId) {
		this.parentPackageId = parentPackageId;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public int getNoOfUsers() {
		return noOfUsers;
	}

	public void setNoOfUsers(int noOfUsers) {
		this.noOfUsers = noOfUsers;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getIndustryId() {
		return industryId;
	}

	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}

	public String getDelieveryType() {
		return delieveryType;
	}

	public void setDelieveryType(String delieveryType) {
		this.delieveryType = delieveryType;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}
