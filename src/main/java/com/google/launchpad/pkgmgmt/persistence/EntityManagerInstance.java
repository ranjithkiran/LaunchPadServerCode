package com.google.launchpad.pkgmgmt.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerInstance {
	private static final String PERSISTENCE_UNIT_NAME = "launchpadJPA";
	private static EntityManagerFactory emFactory;
	static{
		emFactory = Persistence.createEntityManagerFactory("launchpadJPA");
	}
	
	public static EntityManager getEntityManagerInstance() {
	      return emFactory.createEntityManager();
	}
}
