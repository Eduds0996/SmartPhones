package com.br.CadastroSmartPhones.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.CadastroSmartPhones.dao.CadastroSmartPhonesRepository;
import com.br.CadastroSmartPhones.model.SmartPhone;

@Service
@Transactional
public class SmartPhoneServiceImpl implements SmartPhoneService{

	@Autowired
	private CadastroSmartPhonesRepository CSPR;
	
	@Override
	public void salvar(SmartPhone smartPhone) {
		CSPR.salvar(smartPhone);
		
	}

	@Override
	public List<SmartPhone> recuperar() {
		return CSPR.recuperar();
		 
	}

	@Override
	public void excluir(Long id) {
		CSPR.excluir(id);
		
	}

}
