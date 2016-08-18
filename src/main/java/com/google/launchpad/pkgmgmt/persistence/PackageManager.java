package com.google.launchpad.pkgmgmt.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.launchpad.pkgmgmt.dto.Asset;
import com.google.launchpad.pkgmgmt.dto.Package;

public class PackageManager {
	  
       public void create(Package pkgDto){
    	   //PersistenceManager persistMgr=new PersistenceManager();
    	   Injector injector=Guice.createInjector(new EntityManagerInjector());
    	   PersistenceManager persistMgr=injector.getInstance(PersistenceManager.class);
    	   persistMgr.createPkg(pkgDto);
       }
}
