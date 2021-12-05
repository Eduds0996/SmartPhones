package com.br.CadastroSmartPhones.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.br.CadastroSmartPhones.model.SmartPhone;

@Repository
public class CadastroSmartPhonesRepositoryImpl implements CadastroSmartPhonesRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void salvar(SmartPhone smartPhone) {
		em.persist(smartPhone);

	}

	@Override
	public List<SmartPhone> recuperar() {
		return em.createQuery("select s from smartphone s", SmartPhone.class).getResultList();
	}


	@Override
	public void excluir(Long id) {
		em.remove(em.getReference(SmartPhone.class, id));

	}

}
