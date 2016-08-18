package com.google.launchpad.pkgmgmt.dto;
import com.google.launchpad.pkgmgmt.dto.ShareType;

/**
 * Data Transfer Object to hold sharedType data of the package
 * @author kirangk
 *
 */
public class SharedType {
	
	private int Id;
	private ShareType pkgShareType;
	private int sharedUserId;
	
	public SharedType(int Id,ShareType pkgShareType,int sharedUserId){
		this.Id=Id;
		this.pkgShareType=pkgShareType;
		this.sharedUserId=sharedUserId;
	}

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

	@Override
	public String toString() {
		return "SharedType [Id=" + Id + ", pkgShareType=" + pkgShareType + ", sharedUserId=" + sharedUserId + "]";
	}
	
	
}
