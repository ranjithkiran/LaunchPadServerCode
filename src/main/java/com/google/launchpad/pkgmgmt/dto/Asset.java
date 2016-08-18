package com.google.launchpad.pkgmgmt.dto;

import java.util.Date;

/**
 *
 * Data Transfer Object to hold Asset Data
 * @author kirangk
 *
 */
public class Asset {
   
	   private int id;
	   private int seqNumber;
	   private String url;
	   private Date createDate;
	   private Date lastUpdateDate;
   
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSeqNumber() {
		return seqNumber;
	}
	
	public void setSeqNumber(int seqNumber) {
		this.seqNumber = seqNumber;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
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

	@Override
	public String toString() {
		return "Asset [id=" + id + ", seqNumber=" + seqNumber + ", url=" + url + ", createDate=" + createDate
				+ ", lastUpdateDate=" + lastUpdateDate + "]";
	}
	
	
   
   
}

