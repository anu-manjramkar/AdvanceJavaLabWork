package com.cdac.component;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

public class CarPartsInventoryImpl3 implements CarPartsInventory {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void addNewPart(CarPart carPart) {
		em.persist(carPart);

	}
	
	@Override
	public List<CarPart> getAvailableParts() {
		return List<CarPart>;
	}

}
