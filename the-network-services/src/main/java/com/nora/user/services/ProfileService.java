package com.nora.user.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class ProfileService
 */
@Stateless
@LocalBean
public class ProfileService implements ProfileServiceLocal {

	@PersistenceContext(unitName = "the-network-persistence-unit")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public ProfileService() {
		// TODO Auto-generated constructor stub
	}
	
	public EntityManager getEntityManager() {
		return em;
	}
}
