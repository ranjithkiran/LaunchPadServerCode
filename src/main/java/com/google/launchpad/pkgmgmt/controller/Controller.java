package com.google.launchpad.pkgmgmt.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.google.launchpad.pkgmgmt.dto.Asset;
import com.google.launchpad.pkgmgmt.dto.Package;
import com.google.launchpad.pkgmgmt.persistence.EntityManagerInstance;
import com.google.launchpad.pkgmgmt.persistence.PackageManager;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Package packageent = new Package();
		  Date date=new Date();
		  packageent.setCreateDate(date);
		  packageent.setDelieveryType("temp");
		  packageent.setIndustryId(2);
		  packageent.setInstructions("blabla");
		  packageent.setUserId(3);
		  packageent.setParentPackageId(4);
		  packageent.setNoOfUsers(10);
		  packageent.setName("tempppp");
		  packageent.setLastUpdateDate(date);
		  packageent.setLanguage("english");
		  
		  Asset assetone=new Asset();
		  assetone.setCreateDate(date);
		  assetone.setLastUpdateDate(date);
		  assetone.setSeqNumber(1);
		  assetone.setUrl("www.gotogoogleinie.com");
		  
		  
		  Asset assetwo=new Asset();
		  assetwo.setCreateDate(date);
		  assetwo.setLastUpdateDate(date);
		  assetwo.setSeqNumber(1);
		  assetwo.setUrl("www.gotogoogle.com");
		  
		  
		  List<Asset> list=new ArrayList();
		  list.add(assetone);
		  list.add(assetwo);
		  packageent.setAssets(list);
		  
		  PackageManager pkgMgr=new PackageManager();
		  pkgMgr.create(packageent);
	}

}
