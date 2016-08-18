package com.google.launchpad.pkgmgmt.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.google.launchpad.pkgmgmt.dto.Asset;
import com.google.launchpad.pkgmgmt.dto.Package;

/**
 * Performs CRUD operations on the package entity
 * @author kirangk
 *
 */
public class PersistenceManager {
	
	private EntityManagerInstance entityMgrInst;
	
	@Inject
	public void setEntityManager(EntityManagerInstance entityMgrInst){
		this.entityMgrInst=entityMgrInst;
	}
	/**
	 * creates package entity in T_PACKAGE table
	 * @param pkgDto
	 */
	public void createPkg(Package pkgDto){
		EntityManager entityMgr=null;
		try{
			entityMgr=entityMgrInst.getEntityManagerInstance();
			entityMgr.getTransaction().begin();
	    	PackageEntity pkgEntity=new PackageEntity(pkgDto);
	    	entityMgr.persist(pkgEntity);
	    	List<Asset> assetList=pkgDto.getAssets();
	    	List<AssetEntity> assetEntityList=new ArrayList<AssetEntity>();
	    	Iterator<Asset> itr=assetList.iterator();
	    	while(itr.hasNext()){
	    		   AssetEntity tempAssetEntity=new AssetEntity(itr.next());
	    		   tempAssetEntity.setPkgEntity(pkgEntity);
	    		   entityMgr.persist(tempAssetEntity);
	    		   assetEntityList.add(tempAssetEntity);
	    		   
	    	}
	    	pkgEntity.setAssetList(assetEntityList);
	    	entityMgr.persist(pkgEntity);
	    	entityMgr.getTransaction().commit();
		}
		catch(Exception e){
			entityMgr.getTransaction().rollback();
		}
	}
}
