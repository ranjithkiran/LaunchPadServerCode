package com.google.launchpad.pkgmgmt.persistence;

import javax.persistence.EntityManager;

import com.google.inject.AbstractModule;

public class EntityManagerInjector extends AbstractModule{

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		//bind the service to implementation class
		//bind(EntityManager.class).to(EntityManager.class);
		  bind(EntityManagerInstance.class);
	}

}
