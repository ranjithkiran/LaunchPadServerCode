package com.google.launchpad.pkgmgmt.dto;

import java.util.Date;
import java.util.List;

/**
 * Data transfer object for holding the package data
 */
public class Package {
	
	private int				id;
	private String 			name;
	private List<Asset>	assets;
	private int 			parentPackageId;
	private String 			instructions;
	private Date 			createDate;
	private Date 			lastUpdateDate;
	private int 			noOfUsers;
	private int 			userId;
	private int 			industryId;
	private String 			delieveryType;
	private String 			language;
	
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



	public List<Asset> getAssets() {
		return assets;
	}


	public void setAssets(List<Asset> assets) {
		this.assets = assets;
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

	@Override
	public String toString() {
		return "Package [id=" + id + ", name=" + name + ", assets=" + assets + ", parentPackageId=" + parentPackageId
				+ ", instructions=" + instructions + ", createDate=" + createDate + ", lastUpdateDate=" + lastUpdateDate
				+ ", noOfUsers=" + noOfUsers + ", userId=" + userId + ", industryId=" + industryId + ", delieveryType="
				+ delieveryType + ", language=" + language + "]";
	}
	
    
}

