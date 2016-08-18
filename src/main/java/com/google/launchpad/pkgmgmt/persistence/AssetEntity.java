package com.google.launchpad.pkgmgmt.persistence;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.google.launchpad.pkgmgmt.dto.Asset;

@Entity
@Table(name="T_ASSETS")
public class AssetEntity {
	
	
	 @Id
	  @GeneratedValue
	  @Column(name="ASSET_ID")
	  private int id;
	  
	 @ManyToOne
	 @JoinColumn(name = "PACKAGE_ID", nullable = false)
	  private PackageEntity pkgEntity;
	  
	  @	Column(name="SEQ_NUMBER")
	  private int seqNumber;
	  
	  @Column(name="URL_LINK")
	  private String urlLink;
	  
	  @Column(name="CREATE_DATE")
	   private Date createDate;
	 
	  @Column(name="LAST_UPDATE_DATE")
	   private Date lastUpdateDate;

	public  AssetEntity(){
		
	}
	
	
	public  AssetEntity(Asset asset){
		this.id=asset.getId();
		this.seqNumber=asset.getSeqNumber();
		this.urlLink=asset.getUrl();
		this.lastUpdateDate=asset.getLastUpdateDate();
		this.createDate=asset.getCreateDate();
	}
	  
	

	  public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	public PackageEntity getPkgEntity() {
		return pkgEntity;
	}


	public void setPkgEntity(PackageEntity pkgEntity) {
		this.pkgEntity = pkgEntity;
	}


	public int getSeqNumber() {
		return seqNumber;
	}


	public void setSeqNumber(int seqNumber) {
		this.seqNumber = seqNumber;
	}


	public String getUrlLink() {
		return urlLink;
	}


	public void setUrlLink(String urlLink) {
		this.urlLink = urlLink;
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

}
